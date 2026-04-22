package com.thiago.fpseconomy.service;

import com.thiago.fpseconomy.domain.Market;
import com.thiago.fpseconomy.dto.CustomerCreditStatusRequestDTO;
import com.thiago.fpseconomy.dto.PurchaseRequestDTO;
import com.thiago.fpseconomy.domain.MarketEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;

@Service
public class MarketService {
    @Autowired
    public Market;

    public MarketService(Market market) {
        this.Market = Market;
    }

    public void purchaseItem(PurchaseRequestDTO purchaseRequestDTO, CustomerCreditStatusRequestDTO customerCreditStatusRequestDTO) {
        //Pegar valor da proposta do cliente (Então neste caso porque ele poderia fazer uma proposta? RETIRAR PROPOSTA CASO N FAÇA SENTIDO)
        //Pegar fundos do usuario
        //Pegar preço base do item
        //PEGAR categoria do item
        //Aumentar preço do item equivalente a sua categoria
        //  (Simplificado)
        //      - comparar o preços do item atualizado e dos fundos do usuario
        //  (Medio)
        //      - Avaliar desempenho na partida para Aplicar descontos na arma
        //  (Completo)
        //      - Criar dinammica de oferta e demanda avaliando como o stoque de cada arma mediante a como foram as comprar no round anterior

        Market.p
    }
}
