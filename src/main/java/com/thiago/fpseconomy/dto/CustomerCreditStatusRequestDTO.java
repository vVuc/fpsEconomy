package com.thiago.fpseconomy.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class CustomerCreditStatusRequestDTO {

    @NotNull
    @NotEmpty
    private BigDecimal currentCredit;

    @NotNull
    private Boolean hasActiveLoan;

    @NotNull
    @DecimalMax("0.15")
    @DecimalMin("0")
    private BigDecimal losserDiscount;
}
