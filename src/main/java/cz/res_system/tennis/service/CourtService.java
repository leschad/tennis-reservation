package cz.res_system.tennis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.res_system.tennis.entity.CourtEntity;
import cz.res_system.tennis.repository.CourtRepository;

@Service
public class CourtService {

    @Autowired
    private CourtRepository repository;

    public List<CourtEntity> findAll() {
        return repository.findAll();
    }

    public CourtEntity findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public CourtEntity save(CourtEntity court) {
        return repository.save(court);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}

