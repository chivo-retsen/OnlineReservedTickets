package NesterovichAleksandr.OnlineReservedTickets.DAO;

import NesterovichAleksandr.OnlineReservedTickets.service.Cinema;

import java.util.List;

public interface CinemaDAO {

    //create
    void addName(Cinema name);

    //read
    Cinema getIdCinema(int idCinema);

    //update
    void update(Cinema name);

    //delete
    void delete(Cinema name);

    //list
    List<Cinema> getAll();
}
