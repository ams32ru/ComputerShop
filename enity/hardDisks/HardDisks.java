package com.example.computershop.enity.hardDisks;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name = "HardDisks")
@Data
public class HardDisks {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "memorySize",nullable = false)
    private int memorySize;

}
