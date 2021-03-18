package com.store.model.personalData;

import com.store.model.AbstractModel;
import com.store.model.address.Address;

public class PersonalData extends AbstractModel {
    
    private String phone;
    private Address address;

    public PersonalData() {
    }

    public PersonalData(String phone, Address address) {
        this.phone = phone;
        this.address = address;
    }

    public PersonalData(long id, String phone, Address address) {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
