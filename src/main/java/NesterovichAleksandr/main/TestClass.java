package NesterovichAleksandr.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestClass {

    public static void main(String[] args){

        System.out.println("Hibernate tutorial");

        SessionFactory sessionFactory = new Configuration().
                configure().
                buildSessionFactory();

        Session session = sessionFactory.openSession();






        session.close();
        sessionFactory.close();
    }
}
