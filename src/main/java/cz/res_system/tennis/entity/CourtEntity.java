package cz.res_system.tennis.entity;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "courts")
public class CourtEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int number;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "court")
    @JsonIgnore
    private Collection<ReservationEntity> courtReservations;

    public CourtEntity() {
    }

    public CourtEntity(int number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "CourtEntity{" +
                "id=" + id +
                ", number=" + number +
                '}';
    }

    public Collection<ReservationEntity> getCourtReservations() {
        return courtReservations;
    }
}
