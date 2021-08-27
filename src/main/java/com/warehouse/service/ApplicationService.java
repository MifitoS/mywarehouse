package com.warehouse.service;

import com.warehouse.dto.response.StatisticDTO;

public interface ApplicationService {
    void clearAll();

    StatisticDTO getStatistic();
}
