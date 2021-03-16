package com.store.entity.address;

import com.store.entity.Entity;

import javax.persistence.Column;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "address")
public class AddressEntity extends Entity {
    
    @Column(name = "CITY")
    private String city;
    
    @Column(name = "STREET")
    private String street;
    
    @Column(name = "HOUSE")
    private int house;
    
    @Column(name = "FLAT")
    private int flat;

    public AddressEntity() {
    }

    public AddressEntity(String city, String street, int house, int flat) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public AddressEntity(long id, String city, String street, int house, int flat) {
        super(id);
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }
}
