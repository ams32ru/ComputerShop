package com.example.computershop.repository;

import com.example.computershop.enity.desktopcomputer.DesktopComputers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesktopComputersRepository extends JpaRepository<DesktopComputers,Long> {
}
