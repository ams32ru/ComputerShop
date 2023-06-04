package com.example.computershop.controller;

import com.example.computershop.enity.notebook.Notebooks;
import com.example.computershop.service.NotebooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/notebooks", produces = "application/json")
public class NotebooksController {
    final NotebooksService notebooksService;

    public NotebooksController(NotebooksService notebooksService) {
        this.notebooksService = notebooksService;
    }

    @PostMapping("/create-notebooks")
    public Notebooks createNotebooks() {
        return notebooksService.createNotebook();
    }

    @PutMapping("/put-notebooks")
    public ResponseEntity<Notebooks> setNotebooks(@RequestBody Notebooks notebook) {
        Notebooks foundNotebook = notebooksService.editNotebooks(notebook);
        if (foundNotebook == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(foundNotebook);
    }

    @GetMapping("/get-notebooks")
    public ResponseEntity<Notebooks> getNotebooksById(@PathVariable long id) {
        Notebooks notebooks = notebooksService.getNotebooksById(id);
        if (notebooks == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(notebooks);
    }

    @GetMapping("get-all-notebooks")
    public Collection<Notebooks> getAllNotebooks() {
        return notebooksService.getAllNotebooks();
    }
}
