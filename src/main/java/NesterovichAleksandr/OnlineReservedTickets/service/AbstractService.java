package NesterovichAleksandr.OnlineReservedTickets.service;

import NesterovichAleksandr.OnlineReservedTickets.DAO.MainDAO;
import NesterovichAleksandr.OnlineReservedTickets.entity.CinemaEntity;
import NesterovichAleksandr.OnlineReservedTickets.utils.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public abstract class AbstractService implements MainDAO{

    public abstract List getAll();

    public Session getSessionAndBeginTransaction(){
        SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
        if(sessionFactory == null){
            throw new RuntimeException("Session factory is null");
        }
        Session session = sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
        }catch (HibernateException e) {
            e.printStackTrace();
        }
        return session;
    }

}
