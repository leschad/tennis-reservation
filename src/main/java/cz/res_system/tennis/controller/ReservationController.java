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

import cz.res_system.tennis.entity.ReservationEntity;
import cz.res_system.tennis.service.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public List<ReservationEntity> findAll() {
        return reservationService.findAll();
    }

    @GetMapping("/{id}")
    public ReservationEntity findById(@PathVariable Long id) {
        return reservationService.findById(id);
    }

    @PostMapping
    public ReservationEntity save(@RequestBody ReservationEntity reservation) {
        return reservationService.save(reservation);
    }

    @PutMapping
    public ReservationEntity update(@RequestBody ReservationEntity reservation) {
        return reservationService.save(reservation);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        reservationService.delete(id);
    }

}
