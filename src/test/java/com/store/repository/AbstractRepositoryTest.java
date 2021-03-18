package com.store.repository;

import com.store.entity.IEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.Serializable;

public abstract class AbstractRepositoryTest<E extends IEntity, PK extends Serializable> {

    protected BaseRepository<E,PK> repository;

    @Test
    void testCreate() {
        E entity = createEntity();
        Assertions.assertNotNull(entity, "Entity should be non null");
        E result = repository.save(entity);
        Assertions.assertNotNull(result, "Saved entity is null");
        Assertions.assertNotNull(result.getId(), "Entity ID is null");
    }

    protected abstract E createEntity();

    protected abstract void setRepository(BaseRepository<E, PK> repository);
}
