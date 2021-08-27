package com.warehouse.service;

import com.warehouse.dto.putDTO.PutBirdsDTO;
import com.warehouse.dto.request.BirdAddDTO;
import com.warehouse.dto.response.GetBirdsDTO;
import com.warehouse.model.Bird;
import com.warehouse.model.Nest;
import com.warehouse.repository.BirdRepository;
import com.warehouse.repository.NestRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BirdServiceImpl implements BirdService {

    private BirdRepository birdRepository;
    private NestRepository nestRepository;

    public BirdServiceImpl(BirdRepository birdRepository, NestRepository nestRepository) {
        this.birdRepository = birdRepository;
        this.nestRepository = nestRepository;
    }


    @Override
    public void add(BirdAddDTO birdRequestAdd) {
        Optional<Nest> byId = nestRepository.findById(birdRequestAdd.getGroupId());
        Nest nest = byId.get();


        Bird birdToBD = Bird.builder()
                .birdSpecies(birdRequestAdd.getBirdSpecies())
                .color(birdRequestAdd.getColor())
                .fly(birdRequestAdd.getFly())
                .nest(nest)
                .build();

        birdRepository.save(birdToBD);
    }

    @Override
    public Bird put(PutBirdsDTO putBirdsDTO, Long id) {
        Bird build = Bird.builder()
                .birdSpecies(putBirdsDTO.getBirdSpecies())
                .color(putBirdsDTO.getColor())
                .fly(putBirdsDTO.getFly())
                .build();


        build.setId(id);
        return birdRepository.save(build);
    }

    @Override
    public GetBirdsDTO get(Long id) {
        Optional<Bird> byId = birdRepository.findById(id);
        Bird bird = byId.get();


//хз как пообороть рекурсию :(

        GetBirdsDTO build = GetBirdsDTO.builder()
                .birdSpecies(bird.getBirdSpecies())
                .color(bird.getColor())
                .fly(bird.getFly())
                .nest(bird.getNest())
                .build();


        return build;
    }
}


