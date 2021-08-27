package com.warehouse.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BirdAddDTO {


    private String birdSpecies;
    private String color;
    private Boolean fly;
    private Long groupId;
}
