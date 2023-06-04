package com.example.computershop.service;

import com.example.computershop.enity.harddisk.HardDisks;
import com.example.computershop.repository.HardDisksRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Класс сервис для жестких дисков
 */
@Service
public class HardDisksService {

    private final HardDisksRepository disksRepository;

    /**
     * @param disksRepository репозиторий жестких дисков
     */
    public HardDisksService(HardDisksRepository disksRepository) {
        this.disksRepository = disksRepository;
    }

    /**
     * создание нового жесткого диска
     */
    public HardDisks createDesktopComputer() {
        return disksRepository.save(new HardDisks());
    }

    /**
     * изменение жесткого диска
     */
    public HardDisks editComputer(HardDisks hardDisks) {
        return disksRepository.save(hardDisks);
    }

    /**
     * поиск жесткого диска по идентификатору
     */
    public HardDisks getHardDisksById(long id) {
        return disksRepository.findById(id).orElseThrow();
    }

    /**
     * получить колекцию всех имеющихся жестких дисков
     */
    public Collection<HardDisks> getAllHardDisks() {
        return disksRepository.findAll();
    }
}
