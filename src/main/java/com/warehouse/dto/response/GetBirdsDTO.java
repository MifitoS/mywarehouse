package com.warehouse.dto.response;

import com.warehouse.model.Nest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetBirdsDTO {

    private String birdSpecies;
    private String color;
    private Boolean fly;
    private Nest nest;
}
