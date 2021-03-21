package com.store.converter.role;

import com.store.converter.AbstractConverter;
import com.store.entity.role.RoleEntity;
import com.store.model.role.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter extends AbstractConverter<RoleEntity, Role> {

    @Override
    public Role convert(RoleEntity roleEntity) {
        return new Role(roleEntity.getId(), roleEntity.getName());
    }

    @Override
    public RoleEntity convertReverse(Role role) {
        return new RoleEntity(role.getId(), role.getName());
    }
}
