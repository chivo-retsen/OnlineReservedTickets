package com.reservation.dao;

import com.reservation.entity.FilmEntity;

public interface FilmDao extends MainDao {

    //create
    void create(FilmEntity filmEntity);

    //read
    FilmEntity read(long idFilm);

    //update
    void update(FilmEntity filmEntity);

    //delete
    void delete(FilmEntity filmEntity);


}
