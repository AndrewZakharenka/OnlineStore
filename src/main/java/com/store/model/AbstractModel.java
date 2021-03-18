package com.store.model;

public abstract class AbstractModel implements IModel {
    protected long id;

    public AbstractModel(long id) {
        this.id = id;
    }

    public AbstractModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
