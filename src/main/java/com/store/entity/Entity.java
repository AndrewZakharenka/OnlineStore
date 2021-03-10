package com.store.entity;

import javax.persistence.*;

@MappedSuperclass
public abstract class Entity implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    protected long id;

    public Entity() {
    }

    public Entity(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
