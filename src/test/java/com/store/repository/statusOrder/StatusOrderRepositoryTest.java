package com.store.repository.statusOrder;

import com.store.entity.statusOrder.StatusOrderEntity;
import com.store.repository.AbstractRepositoryTest;
import com.store.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class StatusOrderRepositoryTest extends AbstractRepositoryTest<StatusOrderEntity, Long> {

    @Override
    protected StatusOrderEntity createEntity() {
        return new StatusOrderEntity();
    }

    @Override
    @Autowired
    protected void setRepository(BaseRepository<StatusOrderEntity, Long> repository) {
        this.repository = repository;
    }
}