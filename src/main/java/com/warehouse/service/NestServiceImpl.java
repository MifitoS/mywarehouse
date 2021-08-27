package com.warehouse.service;

import com.warehouse.dto.attachDTO.BirdAttachToNestsDTO;
import com.warehouse.dto.request.NestAddDTO;
import com.warehouse.dto.response.GetNestsDTO;
import com.warehouse.model.Bird;
import com.warehouse.model.Nest;
import com.warehouse.repository.NestRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class NestServiceImpl implements NestService {

    private NestRepository nestRepository;

    public NestServiceImpl(NestRepository nestRepository) {
        this.nestRepository = nestRepository;
    }


    @Override
    public void add(NestAddDTO NestRequestAdd) {

        Nest nestToBD = Nest.builder()
                .address(NestRequestAdd.getAddress())
                .nestName(NestRequestAdd.getNestName())
                .build();

        nestRepository.save(nestToBD);
    }

    @Override
    public GetNestsDTO get(Long id) {
        Nest nest = nestRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Person с таким ID: " + id + " - не существует"));


        Set<Bird> birds = nest.getBirds();
        Set<BirdAttachToNestsDTO> collect = birds.stream()
                .map(bird -> BirdAttachToNestsDTO.builder()
                        .id(bird.getId())
                        .birdSpecies(bird.getBirdSpecies())
                        .fly(bird.getFly())
                        .build())
                .collect(Collectors.toSet());


        GetNestsDTO nestsDTO = GetNestsDTO.builder()
                .id(nest.getId())
                .address(nest.getAddress())
                .nestName(nest.getNestName())
                .birds(collect)
                .build();

        return nestsDTO;
    }
}
