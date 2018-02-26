package com.reservation.service;

import com.reservation.entity.FilmEntity;

public interface FilmService extends MainService {

    //create
    void create(FilmEntity filmEntity);

    //read
    FilmEntity read(long idFilm);

    //update
    void update(FilmEntity filmEntity);

    //delete
    void delete(FilmEntity filmEntity); //проверить принимаемые параметры (id?)
}
