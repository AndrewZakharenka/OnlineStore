package com.store.repository.user;

import com.store.entity.user.UserEntity;
import com.store.repository.BaseRepository;

public interface UserRepository extends BaseRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
    UserEntity getById(Long id);
    UserEntity findByName(String name);
}
