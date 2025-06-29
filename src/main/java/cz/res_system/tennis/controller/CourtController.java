package cz.res_system.tennis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import cz.res_system.tennis.entity.CourtEntity;
import cz.res_system.tennis.service.CourtService;

@RestController
@RequestMapping("/courts")
public class CourtController {

    @Autowired
    private CourtService service;

    @GetMapping
    public List<CourtEntity> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public CourtEntity findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public CourtEntity addCourtEntity(@RequestBody CourtEntity court) {
        return service.save(court);
    }

    @PutMapping
    public CourtEntity updateCourtEntity(@RequestBody CourtEntity court) {
        return service.save(court);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
