package com.ssafy.comssa.controller.part;

import com.ssafy.comssa.service.part.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/find")
@Controller
public class PartsFindController {
    @Autowired
    CpuService cpuService;
    GpuService gpuService;
    MainboardService mainboardService;
    MemoryService memoryService;
    PowerService powerService;
    SsdService ssdService;

    @GetMapping(value = "/cpu")
    public String findCpuData() {
        String name = "17913863";
        return cpuService.selectCpu(name);
    }
    @GetMapping(value = "/gpu")
    public String findGpuData() {
        String name = "17913863";
        return gpuService.selectGpu(name);
    }
    @GetMapping(value = "/mainboard")
    public String findMainboardData() {
        String name = "17913863";
        return mainboardService.selectMainboard(name);
    }
    @GetMapping(value = "/memory")
    public String findMemoryData() {
        String name = "17913863";
        return memoryService.selectMemory(name);
    }
    @GetMapping(value = "/power")
    public String findPowerData() {
        String name = "17913863";
        return powerService.selectPower(name);
    }
    @GetMapping(value = "/ssd")
    public String findSsdData() {
        String name = "17913863";
        return ssdService.selectSsd(name);
    }

//    @GetMapping(value = "/save")
//    public String saveUserData(@RequestParam String name, @RequestParam int price) {
//        partService.saveUser(name, price);
//
//        return partService.selectUser(name);
//    }
}