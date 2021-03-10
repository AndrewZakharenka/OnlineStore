package com.store.entity.role;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity extends com.store.entity.Entity {

    @Column(name = "NAME_ROLE")
    private String name_role;

    public RoleEntity(String name_role) {
        this.name_role = name_role;
    }

    public RoleEntity(long id, String name_role) {
        super(id);
        this.name_role = name_role;
    }

    public String getName_role() {
        return name_role;
    }

    public void setName_role(String name_role) {
        this.name_role = name_role;
    }
}
