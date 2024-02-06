package com.example.demo.service.impl;

import com.example.demo.dao.EmployeeDetailRepository;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.mapper.EmployeeDetailMapper;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.models.dto.EmployeeDetailDto;
import com.example.demo.models.dto.EmployeeDto;
import com.example.demo.models.enums.Status;
import com.example.demo.models.request.EmployeeCreateRequest;
import com.example.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    @Override
    public EmployeeDto save(EmployeeDto employeeDto) {
        return EmployeeMapper.INSTANCE.toDto(repository.save(EmployeeMapper.INSTANCE.toEntity(employeeDto)));
    }

    @Override
    public List<EmployeeDto> findAll() {
        return EmployeeMapper.INSTANCE.toDtos(repository.findAll());
    }

    @Override
    public EmployeeDto findById(Long id) {
        return EmployeeMapper.INSTANCE.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    public EmployeeDto update(EmployeeDto employeeDto) {
        return EmployeeMapper.INSTANCE.toDto(repository.saveAndFlush(EmployeeMapper.INSTANCE.toEntity(employeeDto)));
    }

    @Override
    public EmployeeDto create(EmployeeCreateRequest request) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setCreatedDate(LocalDateTime.now());
        employeeDto.setUpdatedDate(LocalDateTime.now());
        employeeDto.setStatus(Status.ACTIVE);
        employeeDto.setName(request.getName());
        employeeDto.setLastname(request.getLastname());
        employeeDto.setMiddleName(request.getMiddleName());
        employeeDto.setEmail(request.getEmail());
        //employeeDto.setBirthDate(request.getBirthDate());
        employeeDto.setPhone(request.getPhone());
        employeeDto.setTin(request.getTin());
        employeeDto.setGender(request.getGender());

        return save(employeeDto);
    }
}
