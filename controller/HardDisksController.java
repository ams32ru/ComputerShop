package com.example.computershop.controller;

import com.example.computershop.enity.harddisks.HardDisks;
import com.example.computershop.repository.HardDisksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hardDisk",produces = "application/json")
public class HardDisksController {
    @Autowired
    HardDisksRepository hardDisksRepository;

    @RequestMapping("/create-hard")
    public HardDisks createHardDisks(){
        return hardDisksRepository.save(new HardDisks());
    }
}
