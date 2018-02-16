package NesterovichAleksandr.DAO;

import NesterovichAleksandr.entity.FilmEntity;

public interface FilmDao {
    //create
    void create(FilmEntity filmEntity);

    //read
    FilmEntity getIdCinema(long idCinema);

    //update
    void update(FilmEntity filmEntity);

    //delete
    void delete(FilmEntity filmEntity);


}
