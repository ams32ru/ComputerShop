package com.example.computershop.enity.notebook;

import com.example.computershop.enity.AbstractEntityProduct;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Notebooks")
@Data
public class Notebooks extends AbstractEntityProduct {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "notebooks_size")
    private NotebooksSize notebooksSize;
}
