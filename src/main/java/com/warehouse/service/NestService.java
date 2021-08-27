package com.warehouse.service;

import com.warehouse.dto.request.NestAddDTO;
import com.warehouse.dto.response.GetNestsDTO;

public interface NestService {

    void add(NestAddDTO nest);

    GetNestsDTO get(Long id);
}
