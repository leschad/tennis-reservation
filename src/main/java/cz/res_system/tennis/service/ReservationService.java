package cz.res_system.tennis.service;

/*
 * @Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {
}
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.res_system.tennis.entity.ReservationEntity;
import cz.res_system.tennis.repository.ReservationRepository;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<ReservationEntity> findAll() {
        return reservationRepository.findAll();
    }

    public ReservationEntity findById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    public ReservationEntity save(ReservationEntity reservation) {
        return reservationRepository.save(reservation);
    }

    public void delete(Long id) {
        reservationRepository.deleteById(id);
    }

}
