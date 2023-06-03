package com.example.computershop.enity.harddisks;

import com.example.computershop.enity.AbstractEntityProduct;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Hard_disks")
@Data
public class HardDisks extends AbstractEntityProduct {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "memory_size",nullable = false)
    private int memorySize;

}
