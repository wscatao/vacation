package com.acmetravel.vacation.setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ProjectSetup implements CommandLineRunner {

    @Autowired
    private PopulateDatabase setup;

    @Override
    public void run(String... args) throws Exception {

//        setup.popular();
    }
}
