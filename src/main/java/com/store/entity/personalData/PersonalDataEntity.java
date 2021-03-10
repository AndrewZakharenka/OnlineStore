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
    private AddressEntity addressEntity;

    public PersonalDataEntity(String phone, AddressEntity addressEntity) {
        this.phone = phone;
        this.addressEntity = addressEntity;
    }

    public PersonalDataEntity(long id, String phone, AddressEntity addressEntity) {
        super(id);
        this.phone = phone;
        this.addressEntity = addressEntity;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }
}
