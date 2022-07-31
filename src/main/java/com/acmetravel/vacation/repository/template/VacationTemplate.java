package com.acmetravel.vacation.repository.template;

import com.acmetravel.vacation.domain.Vacation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VacationTemplate extends MongoRepository<Vacation, String> {
}
