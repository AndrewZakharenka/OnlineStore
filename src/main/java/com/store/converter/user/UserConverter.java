package com.store.converter.user;

import com.store.converter.AbstractConverter;
import com.store.converter.personalData.PersonalDataConverter;
import com.store.converter.role.RoleConverter;
import com.store.entity.user.UserEntity;
import com.store.model.personalData.PersonalData;
import com.store.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends AbstractConverter<UserEntity, User> {

    private RoleConverter roleConverter;
    private PersonalDataConverter personalDataConverter;

    @Override
    public User convert(UserEntity userEntity) {
        return new User(userEntity.getId(), userEntity.getName(), userEntity.getSurname(),
                roleConverter.convert(userEntity.getRole()),
                personalDataConverter.convert(userEntity.getPersonalData()));
    }

    @Override
    public UserEntity convertReverse(User user) {
        return new UserEntity(user.getId(), user.getName(), user.getSurname(),
                roleConverter.convertReverse(user.getRole()),
                personalDataConverter.convertReverse(user.getPersonalData()));
    }

    @Autowired
    public void setPersonalDataConverter(PersonalDataConverter personalDataConverter) {
        this.personalDataConverter = personalDataConverter;
    }
    @Autowired
    public void setRoleConverter(RoleConverter roleConverter) {
        this.roleConverter = roleConverter;
    }
}
