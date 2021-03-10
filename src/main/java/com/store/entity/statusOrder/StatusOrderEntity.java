package com.store.entity.statusOrder;

import com.store.entity.Entity;

import javax.persistence.Column;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "status_order")
public class StatusOrderEntity extends Entity {

    @Column(name = "NAME_STATUS")
    private String nameStatus;

    public String getNameStatus() {
        return nameStatus;
    }

    public void setNameStatus(String nameStatus) {
        this.nameStatus = nameStatus;
    }

    public StatusOrderEntity(long id, String nameStatus) {
        super(id);
        this.nameStatus = nameStatus;
    }

    public StatusOrderEntity(String nameStatus) {
        this.nameStatus = nameStatus;
    }
}
