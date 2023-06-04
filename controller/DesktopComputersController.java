package com.example.computershop.controller;

import com.example.computershop.enity.desktopcomputer.DesktopComputers;
import com.example.computershop.repository.DesktopComputersRepository;
import com.example.computershop.service.DesktopComputersService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/desktopComputers", produces = "application/json")
public class DesktopComputersController {
    final DesktopComputersService computersService;

    public DesktopComputersController(DesktopComputersService computersService) {
        this.computersService = computersService;
    }

    @PostMapping("/create-computer")
    public DesktopComputers createDesktopComputer() {
        return computersService.createDesktopComputer();
    }

    @PutMapping("/put-computer")
    public ResponseEntity<DesktopComputers> setDesktopComputers(@RequestBody DesktopComputers desktopComputers) {
        DesktopComputers foundComputer = computersService.editComputer(desktopComputers);
        if (foundComputer == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundComputer);
    }

    @GetMapping("/get-computer")
    public ResponseEntity<DesktopComputers> getComputerById(@PathVariable long id) {
        DesktopComputers computers = computersService.getComputerById(id);
        if (computers == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(computers);
    }

    @GetMapping("get-all-computers")
    public Collection<DesktopComputers> getAllComputers() {
        return computersService.getAllComputers();
    }
}
