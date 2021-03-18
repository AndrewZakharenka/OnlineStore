package com.store.repository.role;

import com.store.entity.role.RoleEntity;
import com.store.repository.AbstractRepositoryTest;
import com.store.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class RoleRepositoryTest extends AbstractRepositoryTest<RoleEntity, Long> {

    @Override
    protected RoleEntity createEntity() {
        return new RoleEntity();
    }

    @Override
    @Autowired
    protected void setRepository(BaseRepository<RoleEntity, Long> repository) {
        this.repository = repository;
    }
}