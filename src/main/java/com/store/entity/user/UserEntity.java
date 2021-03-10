package com.store.entity.user;

import com.store.entity.personalData.PersonalDataEntity;
import com.store.entity.role.RoleEntity;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_ROLE" , referencedColumnName = "id")
    private RoleEntity role;

    @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "PERSONAL_DATA" , referencedColumnName = "id")
    private PersonalDataEntity personalData;
}
