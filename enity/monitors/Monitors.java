package com.example.computershop.enity.monitors;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Monitors")
@Data
public class Monitors {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "diagonal", nullable = false)
    private int diagonal;
}
