package com.store.model.statusOrder;

import com.store.model.AbstractModel;

public class StatusOrder extends AbstractModel {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusOrder() {
    }

    public StatusOrder(long id, String name) {
        super(id);
        this.name = name;
    }

    public StatusOrder(String name) {
        this.name = name;
    }
}
