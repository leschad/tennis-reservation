package cz.res_system.tennis.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservations")
public class ReservationEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String date;
    private String time;
    private float duration;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;
    @ManyToOne
    @JoinColumn(name = "court_id", nullable = false)
    private CourtEntity court;

    public ReservationEntity() {
    }

    public ReservationEntity(UserEntity user, CourtEntity court, String date, String time, float duration) {
        this.user = user;
        this.court = court;
        this.date = date;
        this.time = time;
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public UserEntity getUser() {
        return user;
    }

    public CourtEntity getCourtId() {
        return court;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public float getDuration() {
        return duration;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public void setCourt(CourtEntity court) {
        this.court = court;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "ReservationEntity{" +
                "id=" + id +
                ", userId=" + user.toString() +
                ", courtId=" + court.toString() +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", duration=" + duration +
                '}';
    }

}
