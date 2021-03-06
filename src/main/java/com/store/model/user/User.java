package com.store.model.user;

import com.store.model.AbstractModel;
import com.store.model.personalData.PersonalData;
import com.store.model.role.Role;

import java.util.Objects;

public class User extends AbstractModel {

    private String name;
    private String surname;
    private String email;
    private String password;
    private Role role;
    private PersonalData personalData;

    public User() {
    }

    public User(long id, String name, String surname, String email,
                String password, Role role, PersonalData personalData) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.role = role;
        this.personalData = personalData;
    }

    public User(String name, String surname, String email,
                String password, Role role, PersonalData personalData) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.role = role;
        this.personalData = personalData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(role, that.role) &&
                Objects.equals(personalData, that.personalData);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }
}
