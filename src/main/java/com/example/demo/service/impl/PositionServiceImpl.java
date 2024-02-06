package com.example.demo.service.impl;

import com.example.demo.dao.PositionRepository;
import com.example.demo.mapper.PositionMapper;
import com.example.demo.models.dto.PositionDto;
import com.example.demo.service.PositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PositionServiceImpl implements PositionService {

    private final PositionRepository repository;
    @Override
    public PositionDto save(PositionDto positionDto) {
        return PositionMapper.INSTANCE.toDto(repository.save(PositionMapper.INSTANCE.toEntity(positionDto)));
    }

    @Override
    public List<PositionDto> findAll() {
        return PositionMapper.INSTANCE.toDtos(repository.findAll());
    }

    @Override
    public PositionDto findById(Long id) {
        return PositionMapper.INSTANCE.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    public PositionDto update(PositionDto positionDto) {
        return PositionMapper.INSTANCE.toDto(repository.saveAndFlush(PositionMapper.INSTANCE.toEntity(positionDto)));
    }
}
