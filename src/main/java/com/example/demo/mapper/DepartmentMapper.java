package com.example.demo.mapper;

import com.example.demo.models.dto.DepartmentDto;
import com.example.demo.models.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper extends BaseMapper<Department, DepartmentDto>{

    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);
}
