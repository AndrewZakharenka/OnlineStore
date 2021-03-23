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
        if (userEntity != null) {
            return new User(userEntity.getId(), userEntity.getName(), userEntity.getSurname(),
                    userEntity.getEmail(), userEntity.getPassword(),
                    roleConverter.convert(userEntity.getRole()),
                    personalDataConverter.convert(userEntity.getPersonalData()));
        } else return new User();
    }

    @Override
    public UserEntity convertReverse(User user) {
        return new UserEntity(user.getId(), user.getName(), user.getSurname(),
                user.getEmail(), user.getPassword(),
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
