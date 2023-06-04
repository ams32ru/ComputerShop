package com.example.computershop.repository;

import com.example.computershop.enity.monitor.Monitors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorsRepository extends JpaRepository<Monitors,Long> {
}
