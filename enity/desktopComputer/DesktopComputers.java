package com.example.computershop.enity.desktopComputer;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "DesktopComputers")
public class DesktopComputers {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "formFactor")
    private FormFactor formFactor;
}
