package com.example.computershop.service;

import com.example.computershop.enity.monitors.Monitors;
import com.example.computershop.repository.MonitorsRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MonitorsService {
    private final MonitorsRepository monitorsRepository;

    public MonitorsService(MonitorsRepository monitorsRepository) {
        this.monitorsRepository = monitorsRepository;
    }

    public Monitors createMonitor() {
        return monitorsRepository.save(new Monitors());
    }

    public Monitors editMonitors(Monitors monitor) {
        return monitorsRepository.save(monitor);
    }

    public Monitors getMonitorsById(long id) {
        return monitorsRepository.findById(id).orElseThrow();
    }

    public Collection<Monitors> getAllMonitors() {
        return monitorsRepository.findAll();
    }
}
