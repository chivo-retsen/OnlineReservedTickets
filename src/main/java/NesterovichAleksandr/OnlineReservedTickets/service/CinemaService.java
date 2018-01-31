package NesterovichAleksandr.OnlineReservedTickets.service;

import NesterovichAleksandr.OnlineReservedTickets.DAO.CinemaDAO;
import NesterovichAleksandr.OnlineReservedTickets.utils.HibernateSessionFactory;

import java.sql.Connection;
import java.util.List;

public class CinemaService extends HibernateSessionFactory implements CinemaDAO {

    //Connection connection = getConnection();

    public void addName(Cinema name) {

    }

    public Cinema getIdCinema(int idCinema) {
        return null;
    }

    public void update(Cinema name) {

    }

    public void delete(Cinema name) {

    }

    public List<Cinema> getAll() {
        return null;
    }
}
