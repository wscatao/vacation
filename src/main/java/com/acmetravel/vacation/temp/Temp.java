package com.acmetravel.vacation.temp;

import com.acmetravel.vacation.domain.Vacation;
import com.acmetravel.vacation.repository.template.VacationTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Temp implements CommandLineRunner {

    @Autowired
    private VacationTemplate template;

    @Override
    public void run(String... args) throws Exception {

        var vacation = new Vacation("Ferias", "vem logo");

        template.save(vacation);
    }
}
