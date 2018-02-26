package com.reservation.dao.impl;

import com.reservation.dao.IndividualCabinetDao;
import com.reservation.entity.IndividualCabinetEntity;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class IndividualCabinetDaoImpl extends MainDaoImpl implements IndividualCabinetDao {

    public void create(IndividualCabinetEntity individualCabinetEntity) {
        Session session = getSessionAndBeginTransaction();
        session.save(individualCabinetEntity);
        session.getTransaction().commit();
    }

    public IndividualCabinetEntity read(long idIndividualCabinet) {
        Session session = getSessionAndBeginTransaction();
        IndividualCabinetEntity id = session.get(IndividualCabinetEntity.class,idIndividualCabinet);
        session.getTransaction().commit();
        return id;
    }

    public void update(IndividualCabinetEntity individualCabinetEntity) {
        Session session = getSessionAndBeginTransaction();
        session.update(individualCabinetEntity);
        session.getTransaction().commit();
    }

    public void delete(IndividualCabinetEntity individualCabinetEntity) {
        Session session = getSessionAndBeginTransaction();
        session.delete(individualCabinetEntity);
        session.getTransaction().commit();
    }

    public List getAll() {
        Session session = getSessionAndBeginTransaction();
        String nameClass = (IndividualCabinetEntity.class.getSimpleName());
        Query query = session.createQuery("from " + nameClass);
        List list = query.list();
        session.getTransaction().commit();
        return list;
    }
}
