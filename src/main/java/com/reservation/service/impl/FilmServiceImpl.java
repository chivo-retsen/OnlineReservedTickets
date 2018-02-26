package com.reservation.service.impl;

import com.reservation.dao.FilmDao;
import com.reservation.entity.FilmEntity;
import com.reservation.service.FilmService;

import java.util.List;

public class FilmServiceImpl implements FilmService {

    private FilmDao filmDao;

    // добавить set?

    public void create(FilmEntity filmEntity) {
        this.filmDao.create(filmEntity);
    }

    public FilmEntity read(long idFilm) {
        return this.filmDao.read(idFilm);
    }

    public void update(FilmEntity filmEntity) {
        this.filmDao.update(filmEntity);
    }

    public void delete(FilmEntity filmEntity) {
        this.filmDao.delete(filmEntity);
    }

    public List getAll() {
        return this.filmDao.getAll();
    }
}
