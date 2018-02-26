package com.reservation.dao;

import com.reservation.entity.SeatEntity;

public interface SeatDao extends MainDao {

    //create
    void create(SeatEntity seatEntity);

    //read
    SeatEntity read(long idSeat);

    //update
    void update(SeatEntity seatEntity);

    //delete
    void delete(SeatEntity seatEntity); //проверить принимаемые параметры (id)


}
