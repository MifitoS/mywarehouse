package com.warehouse.controller;

import com.warehouse.dto.response.StatisticDTO;
import com.warehouse.service.ApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    private final ApplicationService service;

    public ServiceController(ApplicationService service) {
        this.service = service;
    }


    @GetMapping("/clear")
    public void clearData() {
        service.clearAll();
    }

    @GetMapping("/statistics")
    public StatisticDTO getStatistic(){
        return service.getStatistic();
    }

}
