package com.reservation.dao.impl;

import com.reservation.dao.CinemaDao;
import com.reservation.entity.CinemaEntity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.stereotype.Repository;
//  import org.slf4j.LoggerFactory; //удалить зависимость

import java.util.List;
import java.util.logging.Logger;

@Repository //какая польза?
public class CinemaDaoImpl extends MainDaoImpl implements CinemaDao {
    // private static final Logger logger = LoggerFactory.getLogger(CinemaDaoImpl.class);  //удалить

//    public CinemaDaoImpl() {
//        super(CinemaEntity.class); //?
//    }

    public void create(CinemaEntity cinemaEntity) {
        Session session = getSessionAndBeginTransaction();
        session.save(cinemaEntity);
        session.getTransaction().commit();
    }

    public CinemaEntity getIdCinema(long idCinema) {
        Session session = getSessionAndBeginTransaction();
        CinemaEntity id = session.get(CinemaEntity.class,idCinema);
        session.getTransaction().commit();
        return id;
    }

    public void update(CinemaEntity cinemaEntity) {
        Session session = getSessionAndBeginTransaction();
        session.update(cinemaEntity);
        session.getTransaction().commit();
    }

    public void delete(CinemaEntity cinemaEntity) {
        Session session = getSessionAndBeginTransaction();
        session.delete(cinemaEntity);
        session.getTransaction().commit();
    }

    public List getAll() {
        Session session = getSessionAndBeginTransaction();
        String nameClass = (CinemaEntity.class.getSimpleName());
        Query query = session.createQuery("from " + nameClass);
        List list = query.list();
        session.getTransaction().commit();
        return list;
    }
}
