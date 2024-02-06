package com.example.demo.mapper;

import com.example.demo.models.dto.EmployeeDto;
import com.example.demo.models.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee, EmployeeDto>{
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
}
