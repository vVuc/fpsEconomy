package com.thiago.fpseconomy.infra.adapters.out.persistence.entities;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "Stock")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JpaStockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemName;
    private BigDecimal price;
    private int quantity;
    private int total;
    private String category;
    private String subCategory;

}
