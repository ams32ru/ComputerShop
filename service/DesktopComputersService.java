package com.example.computershop.service;

import com.example.computershop.enity.desktopcomputer.DesktopComputers;
import com.example.computershop.repository.DesktopComputersRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DesktopComputersService {
    private final DesktopComputersRepository computersRepository;

    public DesktopComputersService(DesktopComputersRepository computersRepository) {
        this.computersRepository = computersRepository;
    }

    /*
    создать новый компьютер
     */
    public DesktopComputers createDesktopComputer() {
        return computersRepository.save(new DesktopComputers());
    }

    /*
    изменить настольный компьютер
     */
    public DesktopComputers editComputer(DesktopComputers desktopComputers) {
        return computersRepository.save(desktopComputers);
    }


    /*
    получить компьютер по идентификатору
     */
    public DesktopComputers getComputerById(long id) {
        return computersRepository.findById(id).orElseThrow();
    }

    /*
    Получить все компьютеры
     */
    public Collection<DesktopComputers> getAllComputers() {
        return computersRepository.findAll();
    }
}
