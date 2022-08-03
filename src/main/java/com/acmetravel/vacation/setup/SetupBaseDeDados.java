package com.acmetravel.vacation.setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SetupBaseDeDados implements CommandLineRunner {

    @Autowired
    private PopularDB setup;

    @Override
    public void run(String... args) throws Exception {

//        setup.popular();
    }
}
