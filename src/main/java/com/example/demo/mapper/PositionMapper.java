package com.example.demo.mapper;

import com.example.demo.models.dto.PositionDto;
import com.example.demo.models.entity.Position;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PositionMapper extends BaseMapper<Position, PositionDto> {

    PositionMapper INSTANCE = Mappers.getMapper(PositionMapper.class);
}
