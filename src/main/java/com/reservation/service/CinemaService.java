package com.reservation.service;

import com.reservation.dao.CinemaDao;
import com.reservation.entity.CinemaEntity;

public class CinemaService {

    private CinemaDao cinemaDao;
    private CinemaEntity cinemaEntity;

    public void setCinemaDao(CinemaDao cinemaDao) {
        this.cinemaDao = cinemaDao;
    }

    public void setCinemaEntity(CinemaEntity cinemaEntity) { //зачем? пока не понимаю суть.
        this.cinemaEntity = cinemaEntity;
    }

    public CinemaEntity getCinemaEntity() {
        return cinemaEntity;
    }

    public void createCinema(){
        cinemaDao.create(cinemaEntity);
    }

    public void updateCinema(){
        cinemaDao.update(cinemaEntity);
    }

    public void deleteCinema(){
        cinemaDao.delete(cinemaEntity);
    }

}
