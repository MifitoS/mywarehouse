package com.warehouse.controller;

import com.warehouse.dto.putDTO.PutBirdsDTO;
import com.warehouse.dto.request.BirdAddDTO;
import com.warehouse.dto.response.GetBirdsDTO;
import com.warehouse.model.Bird;
import com.warehouse.service.BirdService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/bird")
public class BirdController {

    BirdService birdService;


    public BirdController(BirdService birdService) {
        this.birdService = birdService;
    }

    @PostMapping(path = "/add")
    public void add(@Valid @RequestBody BirdAddDTO birdAddDTO) {

        birdService.add(birdAddDTO);
    }

    @PutMapping(path = "/update/{id}")
    public Bird updateBird(@RequestBody PutBirdsDTO putBirdsDTO, @PathVariable("id") Long id) {

        return birdService.put(putBirdsDTO, id);
    }

    @GetMapping(path = "/get")
    public GetBirdsDTO get(@RequestParam Long id) {
        return birdService.get(id);
    }
}



