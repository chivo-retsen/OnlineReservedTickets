package com.reservation.dao;

import com.reservation.entity.IndividualCabinetEntity;

public interface IndividualCabinetDao extends MainDao {

    //create
    void create(IndividualCabinetEntity individualCabinetEntity);

    //read
    IndividualCabinetEntity getIdIndividualCabinet(long idIndividualCabinet);

    //update
    void update(IndividualCabinetEntity individualCabinetEntity);

    //delete
    void delete(IndividualCabinetEntity individualCabinetEntity);
}
