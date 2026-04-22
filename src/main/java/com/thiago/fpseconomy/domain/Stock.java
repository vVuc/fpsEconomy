package com.thiago.fpseconomy.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    private Long id;
    private String itemName;
    private BigDecimal price;
    private int quantity;
    private int total;
    private String category;
    private String subCategory;
}  
