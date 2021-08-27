package com.warehouse.controller;


import com.warehouse.dto.request.NestAddDTO;
import com.warehouse.dto.response.GetNestsDTO;
import com.warehouse.service.NestService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/nest")
public class NestController {


    NestService nestService;

    public NestController(NestService nestService) {
        this.nestService = nestService;
    }

    @PostMapping(path = "/add")
    public void add(@RequestBody NestAddDTO nest) {
        nestService.add(nest);
    }

    //Имхо этот метод больше подходит под условия вывода статистики.
    //Но я напишу еще доп статистику, выводящую
    @GetMapping(path = "/get")
    public GetNestsDTO get(@RequestParam Long id) {
        return nestService.get(id);
    }
}
