package com.reservation.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "seance", schema = "online_reserved_tickets", catalog = "")
public class SeanceEntity {
    private int idseance;
    private Timestamp date;
    private Timestamp time;

    @Id
    @Column(name = "idseance", nullable = false)
    public int getIdseance() {
        return idseance;
    }

    public void setIdseance(int idseance) {
        this.idseance = idseance;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "time", nullable = false)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SeanceEntity that = (SeanceEntity) o;

        if (idseance != that.idseance) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idseance;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
