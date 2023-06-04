package com.example.computershop.repository;

import com.example.computershop.enity.notebook.Notebooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotebooksRepository extends JpaRepository<Notebooks,Long> {
}
