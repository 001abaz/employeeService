package com.example.demo.mapper;

import com.example.demo.models.dto.EmployeeDetailDto;
import com.example.demo.models.entity.EmployeeDetail;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeDetailMapper extends BaseMapper<EmployeeDetail, EmployeeDetailDto>{

    EmployeeDetailMapper INSTANCE = Mappers.getMapper(EmployeeDetailMapper.class);
}
