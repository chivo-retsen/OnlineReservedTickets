package com.reservation.dao;

import com.reservation.entity.CinemaEntity;

public interface CinemaDao extends MainDao {

    //create
    void create(CinemaEntity cinemaEntity);

    //read
    CinemaEntity getIdCinema(long idCinema);

    //update
    void update(CinemaEntity cinemaEntity);

    //delete
    void delete(CinemaEntity cinemaEntity); //проверить принимаемые параметры


}
