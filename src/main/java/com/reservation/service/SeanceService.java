package com.reservation.service;

import com.reservation.entity.SeanceEntity;

public interface SeanceService extends MainService {

    //create
    void create(SeanceEntity seanceEntity);

    //read
    SeanceEntity read(long idSeance);

    //update
    void update(SeanceEntity seanceEntity);

    //delete
    void delete(SeanceEntity seanceEntity); //проверить принимаемые параметры (id?)
}
