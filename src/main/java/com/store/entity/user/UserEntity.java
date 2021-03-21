package com.store.entity.user;

import com.store.entity.personalData.PersonalDataEntity;
import com.store.entity.role.RoleEntity;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class UserEntity extends com.store.entity.Entity {

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_ROLE" , referencedColumnName = "id")
    private RoleEntity role;

    @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_PERSONAL_DATA" , referencedColumnName = "id")
    private PersonalDataEntity personalData;

    public UserEntity() {
    }

    public UserEntity(String name, String surname, RoleEntity role, PersonalDataEntity personalData) {
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.personalData = personalData;
    }

    public UserEntity(long id, String name, String surname, RoleEntity role, PersonalDataEntity personalData) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.personalData = personalData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(role, that.role) &&
                Objects.equals(personalData, that.personalData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, role, personalData);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public PersonalDataEntity getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalDataEntity personalData) {
        this.personalData = personalData;
    }
}
