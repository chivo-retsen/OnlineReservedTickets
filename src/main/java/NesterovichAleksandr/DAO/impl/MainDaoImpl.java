package NesterovichAleksandr.DAO.impl;

import NesterovichAleksandr.DAO.MainDao;
import NesterovichAleksandr.entity.CinemaEntity;
import NesterovichAleksandr.utils.HibernateSessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public abstract class MainDaoImpl implements MainDao {


    public MainDaoImpl(Class<CinemaEntity> cinemaEntityClass) { //?
    }

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
