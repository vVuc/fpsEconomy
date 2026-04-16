package com.thiago.fpseconomy.model;

import lombok.Data;

@Data
public class MarketEntity {
    public Integer purchase(Integer amount, Integer itemPrice) {
        if (amount < itemPrice) {
            throw new IllegalArgumentException("The amount must be greater than or equal to the item price");
        }
        return  amount - itemPrice;
    }

}
