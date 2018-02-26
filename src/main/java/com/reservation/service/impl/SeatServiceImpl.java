package com.reservation.service.impl;

import com.reservation.dao.SeatDao;
import com.reservation.entity.SeatEntity;
import com.reservation.service.SeatService;

import java.util.List;

public class SeatServiceImpl implements SeatService {

    private SeatDao seatDao;

    //set?

    public void create(SeatEntity seatEntity) {
        this.seatDao.create(seatEntity);
    }

    public SeatEntity read(long idSeat) {
        return this.seatDao.read(idSeat);
    }

    public void update(SeatEntity seatEntity) {
        this.seatDao.update(seatEntity);
    }

    public void delete(SeatEntity seatEntity) {
        this.seatDao.delete(seatEntity);
    }

    public List getAll() {
        return this.seatDao.getAll();
    }
}
