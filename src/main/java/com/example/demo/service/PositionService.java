package com.example.demo.service;

import com.example.demo.models.dto.PositionDto;

import java.util.List;

public interface PositionService extends BaseService<PositionDto>{
    @Override
    PositionDto save(PositionDto positionDto);

    @Override
    List<PositionDto> findAll();

    @Override
    PositionDto findById(Long id);

    @Override
    PositionDto update(PositionDto positionDto);
}
