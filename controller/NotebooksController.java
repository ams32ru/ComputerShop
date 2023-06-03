package com.example.computershop.controller;

import com.example.computershop.enity.monitors.Monitors;
import com.example.computershop.enity.notebooks.Notebooks;
import com.example.computershop.repository.NotebooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notebooks",produces = "application/json")
public class NotebooksController {
    @Autowired
    NotebooksRepository notebooksRepository;

    @PostMapping("/create-notebook")
    public Notebooks createNotebooks(){
        return notebooksRepository.save(new Notebooks());
    }
}
