package com.example.computershop.controller;

import com.example.computershop.enity.desktopcomputer.DesktopComputers;
import com.example.computershop.repository.DesktopComputersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/desktopComputers",produces = "application/json")
public class DesktopComputersController {
    @Autowired
    DesktopComputersRepository computersRepository;

    @RequestMapping("/create-computer")
    public DesktopComputers createDesktopComputer(){
        return computersRepository.save(new DesktopComputers());
    }
}
