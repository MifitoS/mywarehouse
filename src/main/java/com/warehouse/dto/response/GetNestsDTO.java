package com.warehouse.dto.response;

import com.warehouse.dto.attachDTO.BirdAttachToNestsDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetNestsDTO {

    //выведем-с гнезда со списком птиц
    private Long id;
    private String address;
    private String nestName;

    private Set<BirdAttachToNestsDTO> birds;
}
