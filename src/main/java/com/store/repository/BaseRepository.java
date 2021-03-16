package com.store.repository;

import com.store.entity.IEntity;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<E extends IEntity, PK extends Serializable>
        extends PagingAndSortingRepository<E, PK> {
}
