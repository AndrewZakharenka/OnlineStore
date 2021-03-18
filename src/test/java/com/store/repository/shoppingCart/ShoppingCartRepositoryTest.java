package com.store.repository.shoppingCart;

import com.store.entity.address.AddressEntity;
import com.store.entity.personalData.PersonalDataEntity;
import com.store.entity.role.RoleEntity;
import com.store.entity.shoppingCart.ShoppingCartEntity;
import com.store.entity.user.UserEntity;
import com.store.repository.AbstractRepositoryTest;
import com.store.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ShoppingCartRepositoryTest extends AbstractRepositoryTest<ShoppingCartEntity, Long> {

    @Override
    protected ShoppingCartEntity createEntity() {
        ShoppingCartEntity shoppingCartEntity = new ShoppingCartEntity();
        UserEntity user = new UserEntity();
        PersonalDataEntity personalData = new PersonalDataEntity();
        personalData.setAddress(new AddressEntity());
        user.setPersonalData(personalData);
        user.setRole(new RoleEntity());
        shoppingCartEntity.setUser(user);
        return shoppingCartEntity;
    }

    @Override
    @Autowired
    protected void setRepository(BaseRepository<ShoppingCartEntity, Long> repository) {
        this.repository = repository;
    }
}