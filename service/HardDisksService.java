package com.example.computershop.service;

import com.example.computershop.enity.harddisks.HardDisks;
import com.example.computershop.repository.HardDisksRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class HardDisksService {

    private final HardDisksRepository disksRepository;

    public HardDisksService(HardDisksRepository disksRepository) {
        this.disksRepository = disksRepository;
    }

    public HardDisks createDesktopComputer() {
        return disksRepository.save(new HardDisks());
    }

    public HardDisks editComputer(HardDisks hardDisks) {
        return disksRepository.save(hardDisks);
    }

    public HardDisks getHardDisksById(long id) {
        return disksRepository.findById(id).orElseThrow();
    }

    public Collection<HardDisks> getAllHardDisks() {
        return disksRepository.findAll();
    }
}
