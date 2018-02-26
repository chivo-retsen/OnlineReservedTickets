package com.reservation.service.impl;

import com.reservation.dao.SeanceDao;
import com.reservation.entity.SeanceEntity;
import com.reservation.service.SeanceService;

import java.util.List;

public class SeanceServiceImpl implements SeanceService {

    private SeanceDao seanceDao;

    //set?

    public void create(SeanceEntity seanceEntity) {
        this.seanceDao.create(seanceEntity);
    }

    public SeanceEntity read(long idSeance) {
        return this.seanceDao.read(idSeance);
    }

    public void update(SeanceEntity seanceEntity) {
        this.seanceDao.update(seanceEntity);
    }

    public void delete(SeanceEntity seanceEntity) {
        this.seanceDao.delete(seanceEntity);
    }

    public List getAll() {
        return this.seanceDao.getAll();
    }
}
