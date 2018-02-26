package com.reservation.dao.impl;

import com.reservation.dao.ReservedTicketDao;
import com.reservation.entity.ReservedTicketEntity;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class ReservedTicketDaoImpl extends MainDaoImpl implements ReservedTicketDao{

    public void create(ReservedTicketEntity reservedTicketEntity) {
        Session session = getSessionAndBeginTransaction();
        session.save(reservedTicketEntity);
        session.getTransaction().commit();
    }

    public ReservedTicketEntity read(long idReservedTicket) {
        Session session = getSessionAndBeginTransaction();
        ReservedTicketEntity id = session.get(ReservedTicketEntity.class,idReservedTicket);
        session.getTransaction().commit();
        return id;    }

    public void update(ReservedTicketEntity reservedTicketEntity) {
        Session session = getSessionAndBeginTransaction();
        session.update(reservedTicketEntity);
        session.getTransaction().commit();
    }

    public void delete(ReservedTicketEntity reservedTicketEntity) {
        Session session = getSessionAndBeginTransaction();
        session.delete(reservedTicketEntity);
        session.getTransaction().commit();
    }

    public List getAll() {
        Session session = getSessionAndBeginTransaction();
        String nameClass = (ReservedTicketEntity.class.getSimpleName());
        Query query = session.createQuery("from " + nameClass);
        List list = query.list();
        session.getTransaction().commit();
        return list;    }
}
