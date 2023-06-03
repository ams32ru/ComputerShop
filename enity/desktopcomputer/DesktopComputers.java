package com.example.computershop.enity.desktopcomputer;

import com.example.computershop.enity.AbstractEntityProduct;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "Desktop_computers")
public class DesktopComputers extends AbstractEntityProduct {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "form_factor")
    private FormFactor formFactor;
}
