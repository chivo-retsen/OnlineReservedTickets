package NesterovichAleksandr.OnlineReservedTickets.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Utils {

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

//    public Connection getConnection(){
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection();
//
//        } catch (ClassNotFoundException | SQLException e){
//            e.printStackTrace();
//        }
//        return connection;
//    }
}
