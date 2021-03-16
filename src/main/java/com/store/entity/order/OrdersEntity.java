package com.store.entity.order;

import com.store.entity.personalData.PersonalDataEntity;
import com.store.entity.Entity;
import com.store.entity.product.ProductEntity;
import com.store.entity.statusOrder.StatusOrderEntity;
import com.store.entity.user.UserEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@javax.persistence.Entity
@Table(name = "orders")
public class OrdersEntity extends Entity {

    @Column(name = "TOTAL_PRICE")
    private double totalPrice;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "DATE_ORDER")
    private Date date;

    @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_USER", referencedColumnName = "id")
    private UserEntity userEntity;

    @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_PERSONAL_DATA", referencedColumnName = "id")
    private PersonalDataEntity personalData;

    @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_STATUS_ORDER", referencedColumnName = "id")
    private StatusOrderEntity status;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "orders_products",
            joinColumns = {@JoinColumn(name = "ID_ORDER")},
            inverseJoinColumns = {@JoinColumn(name = "ID_PRODUCT")}
    )
    private Set<ProductEntity> products = new HashSet<>();

    public OrdersEntity() {
    }

    public OrdersEntity(double totalPrice, String comment, Date date, UserEntity userEntity,
                        PersonalDataEntity personalData, StatusOrderEntity status,
                        Set<ProductEntity> products) {
        this.totalPrice = totalPrice;
        this.comment = comment;
        this.date = date;
        this.userEntity = userEntity;
        this.personalData = personalData;
        this.status = status;
        this.products = products;
    }

    public OrdersEntity(long id, double totalPrice, String comment, Date date, UserEntity userEntity,
                        PersonalDataEntity personalData, StatusOrderEntity status,
                        Set<ProductEntity> products) {
        super(id);
        this.totalPrice = totalPrice;
        this.comment = comment;
        this.date = date;
        this.userEntity = userEntity;
        this.personalData = personalData;
        this.status = status;
        this.products = products;
    }

    public Set<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductEntity> products) {
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

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public PersonalDataEntity getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalDataEntity personalData) {
        this.personalData = personalData;
    }

    public StatusOrderEntity getStatus() {
        return status;
    }

    public void setStatus(StatusOrderEntity status) {
        this.status = status;
    }
}
