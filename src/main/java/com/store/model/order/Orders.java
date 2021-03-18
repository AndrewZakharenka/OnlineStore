package com.store.model.order;

import com.store.model.AbstractModel;
import com.store.model.personalData.PersonalData;
import com.store.model.product.Product;
import com.store.model.statusOrder.StatusOrder;
import com.store.model.user.User;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Orders extends AbstractModel {
    
    private double totalPrice;
    private String comment;
    private Date date;
    private User user;
    private PersonalData personalData;
    private StatusOrder status;
    private Set<Product> products = new HashSet<>();

    public Orders() {
    }

    public Orders(double totalPrice, String comment, Date date, User user,
                  PersonalData personalData, StatusOrder status,
                  Set<Product> products) {
        this.totalPrice = totalPrice;
        this.comment = comment;
        this.date = date;
        this.user = user;
        this.personalData = personalData;
        this.status = status;
        this.products = products;
    }

    public Orders(long id, double totalPrice, String comment, Date date, User user,
                  PersonalData personalData, StatusOrder status,
                  Set<Product> products) {
        super(id);
        this.totalPrice = totalPrice;
        this.comment = comment;
        this.date = date;
        this.user = user;
        this.personalData = personalData;
        this.status = status;
        this.products = products;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public StatusOrder getStatus() {
        return status;
    }

    public void setStatus(StatusOrder status) {
        this.status = status;
    }
}
