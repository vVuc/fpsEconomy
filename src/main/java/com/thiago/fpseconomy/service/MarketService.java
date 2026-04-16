package com.thiago.fpseconomy.service;

import com.thiago.fpseconomy.dto.PurchaseRequestDTO;
import com.thiago.fpseconomy.model.MarketEntity;
import org.springframework.stereotype.Service;

@Service
public class MarketService {
    private final MarketEntity marketEntity;

    public MarketService(MarketEntity marketEntity) {
        this.marketEntity = marketEntity;
    }

    public void purchaseItem(PurchaseRequestDTO purchaseRequestDTO) {

    }
}
