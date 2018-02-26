package com.reservation.dao;

import com.reservation.entity.SeanceEntity;

public interface SeanceDao extends MainDao {

    //create
    void create(SeanceEntity seanceEntity);

    //read
    SeanceEntity read(long idSeance);

    //update
    void update(SeanceEntity seanceEntity);

    //delete
    void delete(SeanceEntity seanceEntity); //проверить принимаемые параметры (id)


}
