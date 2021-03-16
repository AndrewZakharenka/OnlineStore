package com.store.repository.shoppingCart;

import com.store.entity.shoppingCart.ShoppingCartEntity;
import com.store.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends BaseRepository<ShoppingCartEntity, Long> {
}
