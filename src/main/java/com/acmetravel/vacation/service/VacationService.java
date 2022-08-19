package com.acmetravel.vacation.service;

import com.acmetravel.vacation.domain.Vacation;
import com.acmetravel.vacation.dto.VacationDto;
import com.acmetravel.vacation.mapper.VacationDtoMapper;
import com.acmetravel.vacation.repository.VacationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class VacationService {

    @Autowired
    VacationRepository vacationRepository;
    public List<VacationDto> getVacations() {

        var vacationList = vacationRepository.getVacations();

        if (vacationList.isEmpty()) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Error connecting to db");
        }

        return mapVacationsList(vacationList);
    }

    private List<VacationDto> mapVacationsList(List<Vacation> vacationsList) {

        var vacationDtos = new ArrayList<VacationDto>();

        vacationsList.forEach(vacation -> vacationDtos.add(VacationDtoMapper.INSTANCE.vacationToVacationDto(vacation)));

        return vacationDtos;
    }
}
