package com.example.demo.service;

import com.example.demo.models.dto.EmployeeDetailDto;

import java.util.List;

public interface EmployeeDetailService extends BaseService<EmployeeDetailDto>{
    @Override
    EmployeeDetailDto save(EmployeeDetailDto employeeDetailDto);

    @Override
    List<EmployeeDetailDto> findAll();

    @Override
    EmployeeDetailDto findById(Long id);

    @Override
    EmployeeDetailDto update(EmployeeDetailDto employeeDetailDto);
}
