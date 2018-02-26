package com.reservation.dao.impl;

import com.reservation.dao.SeanceDao;
import com.reservation.entity.SeanceEntity;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class SeanceDaoImpl extends MainDaoImpl implements SeanceDao {

    public void create(SeanceEntity seanceEntity) {
        Session session = getSessionAndBeginTransaction();
        session.save(seanceEntity);
        session.getTransaction().commit();
    }

    public SeanceEntity read(long idSeance) {
        Session session = getSessionAndBeginTransaction();
        SeanceEntity id = session.get(SeanceEntity.class, idSeance);
        session.getTransaction().commit();
        return id;
    }

    public void update(SeanceEntity seanceEntity) {
        Session session = getSessionAndBeginTransaction();
        session.update(seanceEntity);
        session.getTransaction().commit();
    }

    public void delete(SeanceEntity seanceEntity) {
        Session session = getSessionAndBeginTransaction();
        session.delete(seanceEntity);
        session.getTransaction().commit();
    }

    public List getAll() {
        Session session = getSessionAndBeginTransaction();
        String nameClass = (SeanceEntity.class.getSimpleName());
        Query query = session.createQuery("from " + nameClass);
        List list = query.list();
        session.getTransaction().commit();
        return list;
    }
}
