package com.store.entity.statusOrder;

import com.store.entity.Entity;

import javax.persistence.Column;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "status_order")
public class StatusOrderEntity extends Entity {

    @Column(name = "NAME_STATUS")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusOrderEntity() {
    }

    public StatusOrderEntity(long id, String name) {
        super(id);
        this.name = name;
    }

    public StatusOrderEntity(String name) {
        this.name = name;
    }
}
