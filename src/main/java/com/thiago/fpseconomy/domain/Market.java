package com.thiago.fpseconomy.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Market {
    //Emprestimos ativos


    // Empresta dinheiro
    // valida se um item está no stock
    // verifica se uma compra é possivel
    // Manipula o preço dos items
    //

    public boolean purchase(Integer amount, Integer itemPrice) {
        if (amount < itemPrice) {
            throw new IllegalArgumentException("The amount must be greater than or equal to the item price");
        }
        return  true;
    }

}
