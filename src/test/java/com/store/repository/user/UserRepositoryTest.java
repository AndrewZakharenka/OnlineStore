package com.store.repository.user;

import com.store.entity.address.AddressEntity;
import com.store.entity.personalData.PersonalDataEntity;
import com.store.entity.role.RoleEntity;
import com.store.entity.user.UserEntity;
import com.store.repository.AbstractRepositoryTest;
import com.store.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class UserRepositoryTest extends AbstractRepositoryTest<UserEntity, Long> {

    @Override
    protected UserEntity createEntity() {
        UserEntity userEntity = new UserEntity();
        PersonalDataEntity personalDataEntity = new PersonalDataEntity();
        personalDataEntity.setAddress(new AddressEntity());
        userEntity.setPersonalData(personalDataEntity);
        userEntity.setRole(new RoleEntity());
        return userEntity;
    }

    @Override
    @Autowired
    public void setRepository(BaseRepository<UserEntity, Long> repository) {
        this.repository = repository;
    }
}