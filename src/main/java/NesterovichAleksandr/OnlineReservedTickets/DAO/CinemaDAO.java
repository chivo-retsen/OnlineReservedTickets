package NesterovichAleksandr.OnlineReservedTickets.DAO;

import NesterovichAleksandr.OnlineReservedTickets.entity.CinemaEntity;

import java.util.List;

public interface CinemaDAO {



    //create
    void create(CinemaEntity cinemaEntity);

    //read
    CinemaEntity getIdCinema(long idCinema);

    //update
    void update(CinemaEntity cinemaEntity);

    //delete
    void delete(CinemaEntity cinemaEntity);

    //list
    List getAll();
}
