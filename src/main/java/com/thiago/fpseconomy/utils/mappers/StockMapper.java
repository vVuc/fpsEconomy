package com.thiago.fpseconomy.utils.mappers;

import com.thiago.fpseconomy.domain.Stock;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface StockMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "itemName", target = "itemName"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "quantity", target = "quantity"),
            @Mapping(source = "total", target = "total"),
            @Mapping(source = "category", target = "category"),
            @Mapping(source = "subCategory", target = "subCategory")
    })
    Stock jpaToEntity(Stock jpaStockEntity);
}
