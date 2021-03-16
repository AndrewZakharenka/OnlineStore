package com.store.repository.user;

import com.store.entity.user.UserEntity;
import com.store.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends BaseRepository<UserEntity, Long> {
}
