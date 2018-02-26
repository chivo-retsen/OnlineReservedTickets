package com.reservation.service;

import com.reservation.entity.CinemaEntity;

public interface CinemaService extends MainService {

    //create
    void create(CinemaEntity cinemaEntity);

    //read
    CinemaEntity read(long idCinema);

    //update
    void update(CinemaEntity cinemaEntity);

    //delete
    void delete(CinemaEntity cinemaEntity); //проверить принимаемые параметры (id?)

}
