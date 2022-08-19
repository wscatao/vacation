package com.acmetravel.vacation.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class VacationDto {

    @NotBlank(message = "name is needed")
    private String name;

    @NotBlank(message = "description is needed")
    private String description;

    private String type;

    private List<DestinationDto> destinations;

    private List<IncludeDto> includes;

    @NotNull
    @Min(1)
    @Max(31)
    private int numberOfNights;

    private BigDecimal pricePP;

    private OfferDto offer;

    @NotNull
    private LocalDate validTill;

    @NotNull
    private boolean soldout;
}
