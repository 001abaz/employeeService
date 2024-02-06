package com.example.demo.service.impl;

import com.example.demo.dao.EmployeeDetailRepository;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.mapper.EmployeeDetailMapper;
import com.example.demo.models.dto.EmployeeDetailDto;
import com.example.demo.service.EmployeeDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeDetailServiceImpl implements EmployeeDetailService {

    private final EmployeeDetailRepository repository;

    @Override
    public EmployeeDetailDto save(EmployeeDetailDto employeeDetailDto) {
        return EmployeeDetailMapper.INSTANCE.toDto(repository.save(EmployeeDetailMapper.INSTANCE.toEntity(employeeDetailDto)));
    }

    @Override
    public List<EmployeeDetailDto> findAll() {
        return EmployeeDetailMapper.INSTANCE.toDtos(repository.findAll());
    }

    @Override
    public EmployeeDetailDto findById(Long id) {
        return EmployeeDetailMapper.INSTANCE.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    public EmployeeDetailDto update(EmployeeDetailDto employeeDetailDto) {
        return EmployeeDetailMapper.INSTANCE.toDto(repository.saveAndFlush(EmployeeDetailMapper.INSTANCE.toEntity(employeeDetailDto)));
    }
}
