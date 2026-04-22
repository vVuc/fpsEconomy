package com.thiago.fpseconomy.domain.ports.out;

import com.thiago.fpseconomy.domain.Stock;

import java.util.List;
import java.util.Optional;

public interface StockRepository {

    Optional<Stock> findById(Long id);
    Stock save(Stock stock);
    List<Stock> findAll();
    void deleteById(Long id);

}
