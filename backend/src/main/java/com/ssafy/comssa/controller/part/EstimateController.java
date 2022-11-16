package com.ssafy.comssa.controller.part;

import com.ssafy.comssa.service.estimate.EstimateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;


@Slf4j
@RestController
@RequestMapping(path = "/estimate")
@Controller
public class EstimateController extends PartsFindController{
    @Autowired
    EstimateService estimateService;


    @PostMapping(value = "/default")
//    @GetMapping(value = "/default")
    public ArrayList<JSONObject> findEstimateData(
            @RequestBody JSONObject body
//            @RequestParam(value = "purpose_program",defaultValue = "normal") String program,
//            @RequestParam(value = "budget",defaultValue = "2000000") String budget,
//            @RequestParam(value = "cpu",defaultValue = "need") String needCpu,
//            @RequestParam(value = "gpu",defaultValue = "need") String needGpu,
//            @RequestParam(value = "ssd",defaultValue = "need") String needSSD,
//            @RequestParam(value = "power",defaultValue = "need") String needPower,
//            @RequestParam(value = "memory",defaultValue = "need") String needMemory,
//            @RequestParam(value = "tower",defaultValue = "need") String needTower,
//            @RequestParam(value = "cooler",defaultValue = "need") String needCooler,
//            @RequestParam(value = "mainboard",defaultValue = "need") String needMainboard
    ) throws ParseException {
        JSONParser parser = new JSONParser();
        String program = body.get("purpose_program").toString();
        String forReturnString = estimateService.select(program);
        log.info(program);
        log.info(forReturnString);
        JSONObject jsonObject = (JSONObject) parser.parse(forReturnString);
        log.info(jsonObject.toJSONString());
        log.info("no error2");
        String cpuCode = jsonObject.get("cpu").toString();
        log.info("no error3");
        String gpuCode = jsonObject.get("gpu").toString();
        log.info("no error4");
        String mainboardCode=jsonObject.get("mainboard").toString();
        log.info("no error5");
        String memoryCode =jsonObject.get("memory").toString();
        log.info("no error6");
        String powerCode = jsonObject.get("power").toString();
        log.info("no error7");
        String ssdCode = jsonObject.get("ssd").toString();
        log.info("no error8");
        String coolerCode = jsonObject.get("cooler").toString();
        log.info("no error9");
        String towerCode = jsonObject.get("tower").toString();
        log.info("no error10");
        log.info(jsonObject.toJSONString());
//        if (!needGpu.equals("need")){
//            gpuCode="false";
//        }
//        if (!needCpu.equals("need")){
//            cpuCode="false";
//        }
//        if (!needMainboard.equals("need")){
//            mainboardCode="false";
//        }
//        if (!needMemory.equals("need")){
//            memoryCode="false";
//        }
//        if (!needPower.equals("need")){
//            powerCode="false";
//        }
//        if (!needSSD.equals("need")){
//            powerCode="false";
//        }
//        if (!needCooler.equals("need")){
//            powerCode="false";
//        }
//        if (!needTower.equals("need")){
//            powerCode="false";
//        }



        String cpuFind = findCpuData(cpuCode);
        String gpuFind = findGpuData(gpuCode);
        String mainboardFind = findMainboardData(mainboardCode);
        String memoryFind = findMemoryData(memoryCode);
        String powerFind = findPowerData(powerCode);
        String ssdFind = findSsdData(ssdCode);
        String coolerFind = findCoolerData(coolerCode);
        String towerFind = findTowerData(towerCode);
        JSONObject cpuJsonObject = (cpuFind.equals("none"))? null : (JSONObject) parser.parse(cpuFind);
        JSONObject gpuJsonObject = (gpuFind.equals("none"))? null : (JSONObject) parser.parse(gpuFind);
        JSONObject mainboardJsonObject = (mainboardFind.equals("none"))?null:(JSONObject) parser.parse(mainboardFind);
        JSONObject memoryJsonObject = (memoryFind.equals("none"))?null:(JSONObject) parser.parse(memoryFind);
        JSONObject powerJsonObject = (powerFind.equals("none"))?null:(JSONObject) parser.parse(powerFind);
        JSONObject ssdJsonObject = (ssdFind.equals("none"))?null:(JSONObject) parser.parse(ssdFind);
        JSONObject towerJsonObject = (towerFind.equals("none"))?null:(JSONObject) parser.parse(towerFind);
        JSONObject coolerJsonObject = (coolerFind.equals("none"))?null:(JSONObject) parser.parse(coolerFind);
////        log.info(gpuFind);
//        log.info(needGpu);
//        log.info(cpuCode);
//        log.info(cpuFind);
        ArrayList<JSONObject> returnArray = new ArrayList<JSONObject>();
        JSONObject jsonObject0 = new JSONObject();
        jsonObject0.put("idx",0);
        jsonObject0.put("Detail",cpuJsonObject);
        returnArray.add(jsonObject0);
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("idx",1);
        jsonObject1.put("Detail",mainboardJsonObject);
        returnArray.add(jsonObject1);
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("idx",2);
        jsonObject2.put("Detail",memoryJsonObject);
        returnArray.add(jsonObject2);
        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("idx",3);
        jsonObject3.put("Detail",gpuJsonObject);
        returnArray.add(jsonObject3);
        JSONObject jsonObject4 = new JSONObject();
        jsonObject4.put("idx",4);
        jsonObject4.put("Detail",ssdJsonObject);
        returnArray.add(jsonObject4);
        JSONObject jsonObject5 = new JSONObject();
        jsonObject5.put("idx",5);
        jsonObject5.put("Detail",powerJsonObject);
        returnArray.add(jsonObject5);
        JSONObject jsonObject6 = new JSONObject();
        jsonObject6.put("idx",6);
        jsonObject6.put("Detail",coolerJsonObject);
        returnArray.add(jsonObject6);
        JSONObject jsonObject7 = new JSONObject();
        jsonObject7.put("idx",7);
        jsonObject7.put("Detail",towerJsonObject);
        returnArray.add(jsonObject7);

        return returnArray;
    }

}
