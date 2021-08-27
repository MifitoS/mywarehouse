package com.warehouse.dto.putDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PutBirdsDTO {

    private String birdSpecies;
    private String color;
    private Boolean fly;
}
