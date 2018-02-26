package com.reservation.service.impl;


import com.reservation.dao.CinemaDao;
import com.reservation.entity.CinemaEntity;
import com.reservation.service.CinemaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; //уточнить надобность

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService {

    private CinemaDao cinemaDao;

    public void setCinemaDao(CinemaDao cinemaDao) {  //проверить надобность
        this.cinemaDao = cinemaDao;
    }

    @Transactional
    public void create(CinemaEntity cinemaEntity) {
        this.cinemaDao.create(cinemaEntity);
    }

    @Transactional
    public CinemaEntity read(long idCinema) {
        return this.cinemaDao.read(idCinema);
    }

    @Transactional
    public void update(CinemaEntity cinemaEntity) {
        this.cinemaDao.update(cinemaEntity);
    }

    @Transactional
    public void delete(CinemaEntity cinemaEntity) {
        this.cinemaDao.delete(cinemaEntity);
    }

    @Transactional
    public List getAll() {
        return this.cinemaDao.getAll();
    }
}
