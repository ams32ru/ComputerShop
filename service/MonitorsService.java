package com.example.computershop.service;

import com.example.computershop.enity.monitor.Monitors;
import com.example.computershop.repository.MonitorsRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Класс логики работы с мониторами
 */

@Service
public class MonitorsService {
    private final MonitorsRepository monitorsRepository;

    public MonitorsService(MonitorsRepository monitorsRepository) {
        this.monitorsRepository = monitorsRepository;
    }

    /**
     * создание нового монитора
     */
    public Monitors createMonitor() {
        return monitorsRepository.save(new Monitors());
    }

    /**
     * изменить существующий монитор
     */
    public Monitors editMonitors(Monitors monitor) {
        return monitorsRepository.save(monitor);
    }

    /**
     * поиск монитора по идентификатору
     */
    public Monitors getMonitorsById(long id) {
        return monitorsRepository.findById(id).orElseThrow();
    }

    /**
     * получить колекцию всех имеющихся мониторов
     */
    public Collection<Monitors> getAllMonitors() {
        return monitorsRepository.findAll();
    }
}
