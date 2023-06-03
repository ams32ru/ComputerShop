package com.example.computershop.repository;

import com.example.computershop.enity.harddisks.HardDisks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardDisksRepository extends JpaRepository<HardDisks,Long> {
}
