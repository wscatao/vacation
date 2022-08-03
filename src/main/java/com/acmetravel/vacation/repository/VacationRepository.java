package com.acmetravel.vacation.repository;

import com.acmetravel.vacation.domain.Vacation;
import com.acmetravel.vacation.repository.template.VacationTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacationRepository {

    @Autowired
    private VacationTemplate repository;

    public void salvar(Vacation vacation) {

        repository.save(vacation);
    }
}
