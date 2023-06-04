package com.example.computershop.enity.monitor;

import com.example.computershop.enity.AbstractEntityProduct;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Monitors")
@Data
public class Monitors extends AbstractEntityProduct {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "diagonal", nullable = false)
    private int diagonal;
}
