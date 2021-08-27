package com.warehouse.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatisticDTO {

    Long birdCount;
    Long nestCount;
    Long uniqueBirdSpecies;

}
