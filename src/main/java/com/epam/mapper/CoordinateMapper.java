package com.epam.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.epam.dto.CoordinateDto;
import com.epam.model.Coordinate;

@Mapper(componentModel = "spring")
public interface CoordinateMapper {

	@Mapping(target = "id", ignore = true)
	CoordinateDto coordinateToCoordinateDto(Coordinate coordinate);
	Coordinate coordinateDtoToCoordinate(CoordinateDto coordinateDto);
}
