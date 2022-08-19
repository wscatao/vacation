package com.acmetravel.vacation.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class OfferDto {

    private double discount;

    private String description;

    private LocalDate expires;
}
