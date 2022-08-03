package com.acmetravel.vacation.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
public class Destination {

    @Field("city")
    private String city;

    @Field("country")
    private String country;
}
