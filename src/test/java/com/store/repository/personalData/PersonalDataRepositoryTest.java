package com.store.repository.personalData;

import com.store.entity.address.AddressEntity;
import com.store.entity.personalData.PersonalDataEntity;
import com.store.repository.AbstractRepositoryTest;
import com.store.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PersonalDataRepositoryTest extends AbstractRepositoryTest<PersonalDataEntity, Long> {

    @Override
    protected PersonalDataEntity createEntity() {
        PersonalDataEntity personalDataEntity = new PersonalDataEntity();
        personalDataEntity.setAddress(new AddressEntity());
        return personalDataEntity;
    }

    @Override
    @Autowired
    protected void setRepository(BaseRepository<PersonalDataEntity, Long> repository) {
        this.repository = repository;
    }
}