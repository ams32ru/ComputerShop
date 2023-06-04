package com.example.computershop.service;

import com.example.computershop.enity.desktopcomputer.DesktopComputers;
import com.example.computershop.repository.DesktopComputersRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * в этом классе написана логика работы с настольными компьютерами
 */

@Service
public class DesktopComputersService {
    private final DesktopComputersRepository computersRepository;

    public DesktopComputersService(DesktopComputersRepository computersRepository) {
        this.computersRepository = computersRepository;
    }

    /**
     *Создает новую запись о настольном компьютере
     * @return json объект описания настольного компьютера
     */
    public DesktopComputers createDesktopComputer() {
        return computersRepository.save(new DesktopComputers());
    }

    /**
     * Изменяет запись о настольном компьютере
     * @param desktopComputers
     * @return измененную запись о настольном компьютере
     */
    public DesktopComputers editComputer(DesktopComputers desktopComputers) {
        return computersRepository.save(desktopComputers);
    }

    /**
     * поиск компьютеров по идентификатору
     * @param id
     */
    public DesktopComputers getComputerById(long id) {
        return computersRepository.findById(id).orElseThrow();
    }

    /**
     * @return Колекцию всех записей настольных компьютеров
     */
    public Collection<DesktopComputers> getAllComputers() {
        return computersRepository.findAll();
    }
}
