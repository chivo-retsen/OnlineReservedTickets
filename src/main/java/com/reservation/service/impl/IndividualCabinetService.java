package com.reservation.service.impl;

import com.reservation.dao.IndividualCabinetDao;
import com.reservation.entity.IndividualCabinetEntity;

import java.util.List;

public class IndividualCabinetService implements com.reservation.service.IndividualCabinetService {

    private IndividualCabinetDao individualCabinetDao;

    //set

    public void create(IndividualCabinetEntity individualCabinetEntity) {
        this.individualCabinetDao.create(individualCabinetEntity);
    }

    public IndividualCabinetEntity read(long idIndividualCabinet) {
        return this.individualCabinetDao.read(idIndividualCabinet);
    }

    public void update(IndividualCabinetEntity individualCabinetEntity) {
        this.individualCabinetDao.update(individualCabinetEntity);
    }

    public void delete(IndividualCabinetEntity individualCabinetEntity) {
        this.individualCabinetDao.delete(individualCabinetEntity);
    }

    public List getAll() {
        return this.individualCabinetDao.getAll();
    }
}
