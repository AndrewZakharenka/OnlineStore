package com.store.service;

import com.store.model.AbstractModel;

import java.util.List;

public interface Service<E extends AbstractModel> {
    List<E> getAll();
    void add(E e);
    boolean deleteById(long id);
    void edit(E e);
    E getById(long id);
}
