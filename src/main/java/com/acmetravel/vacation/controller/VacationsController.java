package com.acmetravel.vacation.controller;

import com.acmetravel.vacation.dto.VacationDto;
import com.acmetravel.vacation.service.VacationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/vacations")
public class VacationsController {
    @Autowired
    VacationService vacationService;

    @GetMapping
    public ResponseEntity<List<VacationDto>> getVacations() {

        System.out.println("GET Vacations");

        var response = vacationService.getVacations();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<VacationDto> postVacation(@RequestBody VacationDto vacationRequest) {

        System.out.println("POST Vacation");

        var response = vacationService.save(vacationRequest);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
