package com.store.repository.order;

import com.store.entity.address.AddressEntity;
import com.store.entity.order.OrdersEntity;
import com.store.entity.personalData.PersonalDataEntity;
import com.store.entity.role.RoleEntity;
import com.store.entity.statusOrder.StatusOrderEntity;
import com.store.entity.user.UserEntity;
import com.store.repository.AbstractRepositoryTest;
import com.store.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class OrderRepositoryTest extends AbstractRepositoryTest<OrdersEntity, Long> {

    @Override
    protected OrdersEntity createEntity() {
        PersonalDataEntity personalDataEntity = new PersonalDataEntity();
        OrdersEntity ordersEntity = new OrdersEntity();
        UserEntity userEntity = new UserEntity();
        userEntity.setRole(new RoleEntity());
        userEntity.setPersonalData(personalDataEntity);
        ordersEntity.setUserEntity(userEntity);
        personalDataEntity.setAddress(new AddressEntity());
        ordersEntity.setPersonalData(personalDataEntity);
        ordersEntity.setStatus(new StatusOrderEntity());
        return ordersEntity;
    }

    @Override
    @Autowired
    protected void setRepository(BaseRepository<OrdersEntity, Long> repository) {
        this.repository = repository;
    }
}