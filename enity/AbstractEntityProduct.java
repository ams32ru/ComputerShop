package com.example.computershop.enity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Родительский класс продуктов в магазине
 */
@Data
@MappedSuperclass
public abstract class AbstractEntityProduct {
    @Column(name = "series_number")
    private int seriesNumber;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "quantity_in_stock")
    private int quantityInStock;



}
