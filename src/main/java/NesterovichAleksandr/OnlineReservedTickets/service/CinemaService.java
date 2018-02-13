package NesterovichAleksandr.OnlineReservedTickets.service;

import NesterovichAleksandr.OnlineReservedTickets.DAO.CinemaDAO;
import NesterovichAleksandr.OnlineReservedTickets.entity.CinemaEntity;
import NesterovichAleksandr.OnlineReservedTickets.utils.HibernateSessionFactory;
import NesterovichAleksandr.OnlineReservedTickets.utils.Utils;
import org.hibernate.Session;


import java.sql.Connection;
import java.util.List;

public class CinemaService extends Utils implements CinemaDAO {




    public void create(CinemaEntity cinemaEntity) {
        Session session = getSessionAndBeginTransaction();
        session.save(cinemaEntity);
        session.getTransaction().commit();
    }

    public CinemaEntity getIdCinema(long idCinema) {
        Session session = getSessionAndBeginTransaction();
        CinemaEntity id = session.get(CinemaEntity,idCinema);
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
        return null;
    }
}
