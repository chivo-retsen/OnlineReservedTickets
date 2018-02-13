package NesterovichAleksandr.OnlineReservedTickets.DAO;

import NesterovichAleksandr.OnlineReservedTickets.entity.FilmEntity;

import java.util.List;

public interface FilmDAO {
    //create
    void create(FilmEntity filmEntity);

    //read
    FilmEntity getIdCinema(long idCinema);

    //update
    void update(FilmEntity filmEntity);

    //delete
    void delete(FilmEntity filmEntity);

    //list
    List getAll();
}
