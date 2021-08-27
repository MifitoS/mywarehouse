package com.warehouse.dto.attachDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BirdAttachToNestsDTO {
    private Long id;
    private String birdSpecies;
    private Boolean fly;

}
