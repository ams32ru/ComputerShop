package com.example.computershop.controller;

import com.example.computershop.enity.desktopcomputer.DesktopComputers;
import com.example.computershop.enity.harddisks.HardDisks;
import com.example.computershop.repository.HardDisksRepository;
import com.example.computershop.service.DesktopComputersService;
import com.example.computershop.service.HardDisksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/hardDisk",produces = "application/json")
public class HardDisksController {
    @Autowired
    HardDisksService hardDisksService;

    @PostMapping("/create-computer")
    public HardDisks createHardDisks() {
        return hardDisksService.createDesktopComputer();
    }

    @PutMapping("/put-computer")
    public ResponseEntity<HardDisks> setHardDisks(@RequestBody HardDisks hardDisks) {
        HardDisks foundHardDisks = hardDisksService.editComputer(hardDisks);
        if (foundHardDisks == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundHardDisks);
    }

    @GetMapping("/get-computer")
    public ResponseEntity<HardDisks> getHardDisksById(@PathVariable long id) {
        HardDisks disk = hardDisksService.getHardDisksById(id);
        if (disk == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(disk);
    }

    @GetMapping("get-all-computers")
    public Collection<HardDisks> getAllHardDiskss() {
        return hardDisksService.getAllHardDisks();
    }
}
