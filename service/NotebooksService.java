package com.example.computershop.service;

import com.example.computershop.enity.notebook.Notebooks;
import com.example.computershop.repository.NotebooksRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * класс логики работы с ноутбуками
 */
@Service
public class NotebooksService {
    private final NotebooksRepository notebooksRepository;

    /**
     * конструктор класса
     * @param notebooksRepository репозиторий ноутбуков
     */
    public NotebooksService(NotebooksRepository notebooksRepository) {
        this.notebooksRepository = notebooksRepository;
    }

    /**
     * создать новый ноутбук
     */
    public Notebooks createNotebook() {
        return notebooksRepository.save(new Notebooks());
    }

    /**
     * изменить ноутбук
     */
    public Notebooks editNotebooks(Notebooks notebook) {
        return notebooksRepository.save(notebook);
    }

    /**
     * поиск ноутбука по идентификатору
     */
    public Notebooks getNotebooksById(long id) {
        return notebooksRepository.findById(id).orElseThrow();
    }

    /**
     * получить колекцию имеющихся ноутбуков
     */
    public Collection<Notebooks> getAllNotebooks() {
        return notebooksRepository.findAll();
    }
}
