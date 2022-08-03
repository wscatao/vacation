package com.acmetravel.vacation.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
public class Include {

    @Field("what")
    private String what;

    @Field("description")
    private String description;
}
