package com.acmetravel.vacation.setup;

import com.acmetravel.vacation.domain.Vacation;
import com.acmetravel.vacation.repository.VacationRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class PopulateDatabase {

    @Autowired
    private VacationRepository repository;

    public void popular() {

        var objectMapper = new ObjectMapper();

        try {

            var vacations = objectMapper.readValue(new File("src/main/resources/Data/data.json"),
                    new TypeReference<List<Vacation>>() {
                    });

            vacations.forEach(vacation -> repository.save(vacation));

        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

}
