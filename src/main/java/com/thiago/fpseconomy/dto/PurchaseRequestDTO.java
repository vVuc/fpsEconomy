package com.thiago.fpseconomy.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;

import java.util.UUID;

@Getter
public class PurchaseRequestDTO {

    enum category {
        HIGHT,
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
    private Double customerProposal;
}
