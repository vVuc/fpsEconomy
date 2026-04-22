package com.thiago.fpseconomy.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class PurchaseRequestDTO {

    enum category {
        HIGH,
        MEDIUM,
        LOW
    }

    @NotNull
    @NotEmpty
    private String itemName;

    @NotNull
    @NotEmpty
    private category itemCategory;

    @NotNull
    private BigDecimal itemPrice;

    @NotNull
    private UUID customerId;
}
