package com.ssafy.comssa.service.part;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssafy.comssa.repository.part.MainboardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@SuppressWarnings("unused")
public class MainboardService {

    @Autowired
    MainboardRepository mainboardRepository;

    public String selectMainboard(String name) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            if (name.equals("all")){
                return objectMapper.writeValueAsString(mainboardRepository.findAll());
            }
            if (mainboardRepository.findByPartsID(name)==null){
                return "none";
            }
            return objectMapper.writeValueAsString(mainboardRepository.findByPartsID(name));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "ERROR";
        }
    }

}
