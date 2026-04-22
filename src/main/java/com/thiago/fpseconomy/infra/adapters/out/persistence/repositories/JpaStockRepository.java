package com.thiago.fpseconomy.infra.adapters.out.persistence.repositories;

import com.thiago.fpseconomy.domain.Stock;
import com.thiago.fpseconomy.infra.adapters.out.persistence.entities.JpaStockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaStockRepository extends JpaRepository<JpaStockEntity, Long> {



}
