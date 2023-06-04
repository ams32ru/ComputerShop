package com.example.computershop.controller;

import com.example.computershop.enity.monitor.Monitors;
import com.example.computershop.service.MonitorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/monitors", produces = "application/json")
public class MonitorsController {
    final MonitorsService monitorsService;

    public MonitorsController(MonitorsService monitorsService) {
        this.monitorsService = monitorsService;
    }

    @PostMapping("/create-monitor")
    public Monitors createMonitors() {
        return monitorsService.createMonitor();
    }

    @PutMapping("/put-monitor")
    public ResponseEntity<Monitors> setMonitors(@RequestBody Monitors monitor) {
        Monitors foundMonitors = monitorsService.editMonitors(monitor);
        if (foundMonitors == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundMonitors);
    }

    @GetMapping("/get-monitor")
    public ResponseEntity<Monitors> getMonitorsById(@PathVariable long id) {
        Monitors monitors = monitorsService.getMonitorsById(id);
        if (monitors == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(monitors);
    }

    @GetMapping("get-all-monitors")
    public Collection<Monitors> getAllMonitors() {
        return monitorsService.getAllMonitors();
    }
}
