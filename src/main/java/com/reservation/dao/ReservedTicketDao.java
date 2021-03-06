package com.reservation.dao;

import com.reservation.entity.ReservedTicketEntity;

public interface ReservedTicketDao extends MainDao {

    //create
    void create(ReservedTicketEntity reservedTicketEntity);

    //read
    ReservedTicketEntity read(long idReservedTicket);

    //update
    void update(ReservedTicketEntity reservedTicketEntity);

    //delete
    void delete(ReservedTicketEntity reservedTicketEntity); //проверить принимаемые параметры (id)


}
