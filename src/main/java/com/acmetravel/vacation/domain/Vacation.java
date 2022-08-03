package com.acmetravel.vacation.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Document("vacations")
public class Vacation {

    @Indexed(unique = true, name = "indexName")
    @Field("name")
    private String name;

    @Field("description")
    private String description;

    @Field("type")
    private String type;

    @Field("destinations")
    private List<Destination> destinations;

    @Field("includes")
    private List<Include> includes;

    @Field("numberOfNights")
    private int numberOfNights;

    @Field("pricePP")
    private BigDecimal pricePP;

    @Field("offer")
    private Offer offer;

    @Field("validTill")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate validTill;

    @Field("soldout")
    private boolean soldout;
}
