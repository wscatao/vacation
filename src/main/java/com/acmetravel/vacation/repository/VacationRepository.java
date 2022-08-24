package com.acmetravel.vacation.repository;

import com.acmetravel.vacation.domain.Vacation;
import com.acmetravel.vacation.repository.template.VacationTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@Service
public class VacationRepository {

    @Autowired
    private VacationTemplate repository;

    public Vacation save(Vacation vacation) {

        try {

            return repository.save(vacation);

        } catch (Exception ex) {

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }

    }

    public List<Vacation> getVacations() {

        try {
            var vacationList = repository.findAllWithDateCriteria(LocalDate.now());

            System.out.printf("Quantidade de pacotes retornados, %s%n", vacationList.size());

            return vacationList;

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error connecting to db");
        }
    }
}
