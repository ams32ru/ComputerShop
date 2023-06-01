package com.example.computershop.controller;

import com.example.computershop.enity.hardDisks.HardDisks;
import com.example.computershop.enity.monitors.Monitors;
import com.example.computershop.repository.MonitorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/monitors", produces = "application/json")
public class MonitorsController {
    @Autowired
    MonitorsRepository monitorsRepository;

    @RequestMapping("/create-monitor")
    public Monitors createMonitors() {
        return monitorsRepository.save(new Monitors());
    }

}
