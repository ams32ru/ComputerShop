package com.example.computershop.service;

import com.example.computershop.enity.notebook.Notebooks;
import com.example.computershop.repository.NotebooksRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class NotebooksService {
    private final NotebooksRepository notebooksRepository;

    public NotebooksService(NotebooksRepository notebooksRepository) {
        this.notebooksRepository = notebooksRepository;
    }

    public Notebooks createNotebook() {
        return notebooksRepository.save(new Notebooks());
    }

    public Notebooks editNotebooks(Notebooks notebook) {
        return notebooksRepository.save(notebook);
    }

    public Notebooks getNotebooksById(long id) {
        return notebooksRepository.findById(id).orElseThrow();
    }

    public Collection<Notebooks> getAllNotebooks() {
        return notebooksRepository.findAll();
    }
}
