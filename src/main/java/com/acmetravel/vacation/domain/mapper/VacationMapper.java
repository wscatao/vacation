package com.acmetravel.vacation.domain.mapper;

import com.acmetravel.vacation.domain.Vacation;
import com.acmetravel.vacation.dto.VacationDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VacationMapper {

    VacationMapper INSTANCE = Mappers.getMapper(VacationMapper.class);

    Vacation vacationDtoToVacation(VacationDto vacationDto);
}
