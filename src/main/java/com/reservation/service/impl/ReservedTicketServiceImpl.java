package com.reservation.service.impl;

import com.reservation.dao.ReservedTicketDao;
import com.reservation.entity.ReservedTicketEntity;
import com.reservation.service.ReservedTicketService;

import java.util.List;

public class ReservedTicketServiceImpl implements ReservedTicketService {

    private ReservedTicketDao reservedTicketDao;

    //set?

    public void create(ReservedTicketEntity reservedTicketEntity) {
        this.reservedTicketDao.create(reservedTicketEntity);
    }

    public ReservedTicketEntity read(long idReservedTicket) {
        return this.reservedTicketDao.read(idReservedTicket);
    }

    public void update(ReservedTicketEntity reservedTicketEntity) {
        this.reservedTicketDao.update(reservedTicketEntity);
    }

    public void delete(ReservedTicketEntity reservedTicketEntity) {
        this.reservedTicketDao.delete(reservedTicketEntity);
    }

    public List getAll() {
        return this.reservedTicketDao.getAll();
    }
}
