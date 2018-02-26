package com.reservation.service;

import com.reservation.entity.SeatEntity;

public interface SeatService extends MainService {

    //create
    void create(SeatEntity seatEntity);

    //read
    SeatEntity read(long idSeat);

    //update
    void update(SeatEntity seatEntity);

    //delete
    void delete(SeatEntity seatEntity); //проверить принимаемые параметры (id?)
}
