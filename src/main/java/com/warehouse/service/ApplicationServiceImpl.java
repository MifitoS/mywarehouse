package com.warehouse.service;

import com.warehouse.dto.response.StatisticDTO;
import com.warehouse.repository.BirdRepository;
import com.warehouse.repository.NestRepository;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private NestRepository nestRepository;
    private BirdRepository birdRepository;

    public ApplicationServiceImpl(NestRepository nestRepository, BirdRepository birdRepository) {
        this.nestRepository = nestRepository;
        this.birdRepository = birdRepository;
    }

    @Override
    public void clearAll() {
        birdRepository.deleteAll();
        nestRepository.deleteAll();
    }

    @Override
    public StatisticDTO getStatistic() {

        Long nestCount = nestRepository.count();
        Long birdCount = birdRepository.count();
        Long uniqueBirdSpecies = birdRepository.getUniqueBirdSpecies();


        return StatisticDTO.builder()
                .nestCount(nestCount)
                .birdCount(birdCount)
                .uniqueBirdSpecies(uniqueBirdSpecies)
                .build();
    }
}
