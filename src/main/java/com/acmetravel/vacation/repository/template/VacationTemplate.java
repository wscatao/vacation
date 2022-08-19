package com.acmetravel.vacation.repository.template;

import com.acmetravel.vacation.domain.Vacation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface VacationTemplate extends MongoRepository<Vacation, String> {

    @Query(value = "{ 'validTill': { $gte: ?0 } }")
    List<Vacation> findAllWithDateCriteria(LocalDate data);
}
