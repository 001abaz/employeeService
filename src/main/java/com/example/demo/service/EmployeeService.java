package com.example.demo.service;

import com.example.demo.models.dto.EmployeeDto;
import com.example.demo.models.request.EmployeeCreateRequest;

import java.util.List;

public interface EmployeeService extends BaseService<EmployeeDto>{

    @Override
    EmployeeDto save(EmployeeDto employeeDto);

    @Override
    List<EmployeeDto> findAll();

    @Override
    EmployeeDto findById(Long id);

    @Override
    EmployeeDto update(EmployeeDto employeeDto);

    EmployeeDto create(EmployeeCreateRequest request);
}
