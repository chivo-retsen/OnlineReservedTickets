package com.reservation.dao.impl;

import com.reservation.dao.SeatDao;
import com.reservation.entity.SeatEntity;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class SeatDaoImpl extends MainDaoImpl implements SeatDao {

    public void create(SeatEntity seatEntity) {
        Session session = getSessionAndBeginTransaction();
        session.save(seatEntity);
        session.getTransaction().commit();
    }

    public SeatEntity read(long idSeat) {
        Session session = getSessionAndBeginTransaction();
        SeatEntity id = session.get(SeatEntity.class, idSeat);
        session.getTransaction().commit();
        return id;
    }

    public void update(SeatEntity seatEntity) {
        Session session = getSessionAndBeginTransaction();
        session.update(seatEntity);
        session.getTransaction().commit();
    }

    public void delete(SeatEntity seatEntity) {
        Session session = getSessionAndBeginTransaction();
        session.delete(seatEntity);
        session.getTransaction().commit();
    }

    public List getAll() {
        Session session = getSessionAndBeginTransaction();
        String nameClass = (SeatEntity.class.getSimpleName());
        Query query = session.createQuery("from " + nameClass);
        List list = query.list();
        session.getTransaction().commit();
        return list;    }
}
