package com.store.repository.address;

import com.store.entity.address.AddressEntity;
import com.store.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends BaseRepository<AddressEntity, Long> {
}
