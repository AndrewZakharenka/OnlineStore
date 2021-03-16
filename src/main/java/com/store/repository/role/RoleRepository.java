package com.store.repository.role;

import com.store.entity.role.RoleEntity;
import com.store.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends BaseRepository<RoleEntity, Long> {
}
