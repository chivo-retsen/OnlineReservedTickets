package com.reservation.dao.impl;

import com.reservation.dao.FilmDao;
import com.reservation.entity.FilmEntity;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class FilmDaoImpl extends MainDaoImpl implements FilmDao {

    public void create(FilmEntity filmEntity) {
        Session session = getSessionAndBeginTransaction();
        session.save(filmEntity);
        session.getTransaction().commit();
    }

    public FilmEntity getIdFilm(long idFilm) {
        Session session = getSessionAndBeginTransaction();
        FilmEntity id = session.get(FilmEntity.class,idFilm);
        session.getTransaction().commit();
        return id;
    }

    public void update(FilmEntity filmEntity) {
        Session session = getSessionAndBeginTransaction();
        session.update(filmEntity);
        session.getTransaction().commit();
    }

    public void delete(FilmEntity filmEntity) {
        Session session = getSessionAndBeginTransaction();
        session.delete(filmEntity);
        session.getTransaction().commit();
    }

    public List getAll() {
        Session session = getSessionAndBeginTransaction();
        String nameClass = (FilmEntity.class.getSimpleName());
        Query query = session.createQuery("from " + nameClass);
        List list = query.list();
        session.getTransaction().commit();
        return list;
    }
}
