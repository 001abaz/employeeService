package com.example.demo.service;

import com.example.demo.models.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService extends BaseService<DepartmentDto>{
    @Override
    DepartmentDto save(DepartmentDto departmentDto);

    @Override
    List<DepartmentDto> findAll();

    @Override
    DepartmentDto findById(Long id);

    @Override
    DepartmentDto update(DepartmentDto departmentDto);
}
