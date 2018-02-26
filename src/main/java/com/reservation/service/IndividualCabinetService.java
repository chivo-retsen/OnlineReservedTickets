package com.reservation.service;

import com.reservation.entity.IndividualCabinetEntity;

public interface IndividualCabinetService extends MainService {

    //create
    void create(IndividualCabinetEntity individualCabinetEntity);

    //read
    IndividualCabinetEntity read(long idIndividualCabinet);

    //update
    void update(IndividualCabinetEntity individualCabinetEntity);

    //delete
    void delete(IndividualCabinetEntity individualCabinetEntity); //проверить принимаемые параметры (id?)
}
