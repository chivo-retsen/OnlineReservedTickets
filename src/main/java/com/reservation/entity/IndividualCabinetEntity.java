package com.reservation.entity;

import javax.persistence.*;

@Entity
@Table(name = "individualcabinet", schema = "online_reserved_tickets", catalog = "")
public class IndividualCabinetEntity {
    private int idIndividualCabinet;
    private String login;
    private String firstName;
    private String lastName;
    private Integer phoneNumber;

    @Id
    @Column(name = "idindividualCabinet", nullable = false)
    public int getIdIndividualCabinet() {
        return idIndividualCabinet;
    }

    public void setIdIndividualCabinet(int idIndividualCabinet) {
        this.idIndividualCabinet = idIndividualCabinet;
    }

    @Basic
    @Column(name = "login", nullable = false, length = 45)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "firstName", nullable = false, length = 20)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "lastName", nullable = false, length = 20)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "phoneNumber", nullable = true)
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IndividualCabinetEntity that = (IndividualCabinetEntity) o;

        if (idIndividualCabinet != that.idIndividualCabinet) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idIndividualCabinet;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        return result;
    }
}
