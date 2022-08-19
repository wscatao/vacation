package com.acmetravel.vacation.mapper;

import com.acmetravel.vacation.domain.Vacation;
import com.acmetravel.vacation.dto.VacationDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VacationDtoMapper {

    VacationDtoMapper INSTANCE = Mappers.getMapper(VacationDtoMapper.class);

    @Mapping(target = "name", source = "name")
    VacationDto vacationToVacationDto(Vacation vacation);
}
