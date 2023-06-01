package com.example.computershop.enity.notebooks;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Notebooks")
@Data
public class Notebooks {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "notebooksSize")
    private NotebooksSize notebooksSize;
}
