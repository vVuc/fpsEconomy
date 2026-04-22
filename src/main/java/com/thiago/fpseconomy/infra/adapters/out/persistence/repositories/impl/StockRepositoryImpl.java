package com.thiago.fpseconomy.infra.adapters.out.persistence.repositories.impl;

import com.thiago.fpseconomy.domain.Stock;
import com.thiago.fpseconomy.domain.ports.out.StockRepository;
import com.thiago.fpseconomy.infra.adapters.out.persistence.repositories.JpaStockRepository;
import com.thiago.fpseconomy.utils.mappers.StockMapper;

import java.util.List;
import java.util.Optional;

public class StockRepositoryImpl implements StockRepository {

    private final JpaStockRepository jpaStockRepository;
    private final StockMapper stockMapper;

    public StockRepositoryImpl(JpaStockRepository jpaStockRepository, StockMapper stockMapper) {
        this.jpaStockRepository = jpaStockRepository;
        this.stockMapper = stockMapper;
    }

    @Override
    public Optional<Stock> findById(Long id) {
       Optional<Stock> jpaStockEntity = jpaStockRepository.findById(id);
       jpaStockEntity.ifPresent(jpaStock -> {
          return stockMapper.jpaToEntity(jpaStock);
       });
        return jpaStockEntity;
    }

    @Override
    public Stock save(Stock stock) {
        return null;
    }

    @Override
    public List<Stock> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Long id) {

    }
}
