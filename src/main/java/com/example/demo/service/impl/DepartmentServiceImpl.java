package com.example.demo.service.impl;

import com.example.demo.dao.DepartmentRepository;
import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.models.dto.DepartmentDto;
import com.example.demo.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repository;
    @Override
    public DepartmentDto save(DepartmentDto departmentDto) {
        return DepartmentMapper.INSTANCE.toDto(repository.save(DepartmentMapper.INSTANCE.toEntity(departmentDto)));
    }

    @Override
    public List<DepartmentDto> findAll() {
        return DepartmentMapper.INSTANCE.toDtos(repository.findAll());
    }

    @Override
    public DepartmentDto findById(Long id) {
        return DepartmentMapper.INSTANCE.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    public DepartmentDto update(DepartmentDto departmentDto) {
        return DepartmentMapper.INSTANCE.toDto(repository.saveAndFlush(DepartmentMapper.INSTANCE.toEntity(departmentDto)));
    }
}
