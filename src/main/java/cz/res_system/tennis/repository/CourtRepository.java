package cz.res_system.tennis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cz.res_system.tennis.entity.CourtEntity;

@Repository
public interface CourtRepository extends JpaRepository<CourtEntity, Long> {
}
