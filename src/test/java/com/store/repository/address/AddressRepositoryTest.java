package com.store.repository.address;

import com.store.entity.IEntity;
import com.store.entity.address.AddressEntity;
import com.store.repository.AbstractRepositoryTest;
import com.store.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class AddressRepositoryTest extends AbstractRepositoryTest<AddressEntity, Long> {

    @Override
    protected AddressEntity createEntity() {
        AddressEntity addressEntity = new AddressEntity();
        return addressEntity;
    }

    @Override
    @Autowired
    protected void setRepository(BaseRepository<AddressEntity, Long> repository) {
        this.repository = repository;
    }
}