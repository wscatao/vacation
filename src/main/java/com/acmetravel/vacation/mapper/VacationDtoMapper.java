package com.acmetravel.vacation.mapper;

import com.acmetravel.vacation.domain.Vacation;
import com.acmetravel.vacation.dto.VacationDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VacationDtoMapper {

    VacationDtoMapper INSTANCE = Mappers.getMapper(VacationDtoMapper.class);

    VacationDto vacationToVacationDto(Vacation vacation);
}
