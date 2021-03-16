package com.store.repository.statusOrder;

import com.store.entity.statusOrder.StatusOrderEntity;
import com.store.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusOrderRepository extends BaseRepository<StatusOrderEntity, Long> {
}
