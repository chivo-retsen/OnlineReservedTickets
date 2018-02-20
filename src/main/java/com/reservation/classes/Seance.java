package com.reservation.classes;

import java.sql.Time;
import java.util.Date;

public class Seance {

    private Date date;
    private Time time;

    public Seance(){

    }

    public void readSeat(){

    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }
}
