package NesterovichAleksandr.DAO;

import NesterovichAleksandr.entity.CinemaEntity;

public interface CinemaDao extends MainDao {

    //create
    void create(CinemaEntity cinemaEntity);

    //read
    CinemaEntity getIdCinema(long idCinema);

    //update
    void update(CinemaEntity cinemaEntity);

    //delete
    void delete(CinemaEntity cinemaEntity);


}
