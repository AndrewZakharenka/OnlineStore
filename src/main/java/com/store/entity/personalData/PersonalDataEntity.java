package com.store.entity.personalData;

import com.store.entity.Entity;
import com.store.entity.address.AddressEntity;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name = "personal_data")
public class PersonalDataEntity extends Entity {

    @Column(name = "PHONE")
    private String phone;

    @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "address", referencedColumnName = "id")
    private AddressEntity address;

    public PersonalDataEntity() {
    }

    public PersonalDataEntity(String phone, AddressEntity address) {
        this.phone = phone;
        this.address = address;
    }

    public PersonalDataEntity(long id, String phone, AddressEntity address) {
        super(id);
        this.phone = phone;
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }
}
