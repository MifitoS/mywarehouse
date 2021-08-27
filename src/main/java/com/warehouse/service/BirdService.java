package com.warehouse.service;

import com.warehouse.dto.putDTO.PutBirdsDTO;
import com.warehouse.dto.request.BirdAddDTO;
import com.warehouse.dto.response.GetBirdsDTO;
import com.warehouse.model.Bird;

public interface BirdService {

    void add(BirdAddDTO birdAddDTO);


    Bird put(PutBirdsDTO putBirdsDTO, Long id);

    GetBirdsDTO get(Long id);
}
