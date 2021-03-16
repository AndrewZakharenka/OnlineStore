package com.store.repository.impl;

import com.store.entity.IEntity;
import com.store.repository.BaseRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;
import java.io.Serializable;

@NoRepositoryBean
public class BaseRepositoryImpl<E extends IEntity, PK extends Serializable>
    extends SimpleJpaRepository<E, PK> implements BaseRepository<E, PK> {

    public BaseRepositoryImpl(JpaEntityInformation<E, ?> entityInformation,
                              EntityManager entityManager) {
        super(entityInformation, entityManager);
    }

    public BaseRepositoryImpl(Class<E> domainClass, EntityManager em) {
        super(domainClass, em);
    }
}
