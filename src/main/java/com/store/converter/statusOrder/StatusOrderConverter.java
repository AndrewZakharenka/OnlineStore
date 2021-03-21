package com.store.converter.statusOrder;

import com.store.converter.AbstractConverter;
import com.store.entity.statusOrder.StatusOrderEntity;
import com.store.model.statusOrder.StatusOrder;
import org.springframework.stereotype.Component;

@Component
public class StatusOrderConverter extends AbstractConverter<StatusOrderEntity, StatusOrder> {

    @Override
    public StatusOrder convert(StatusOrderEntity statusOrderEntity) {
        return new StatusOrder(statusOrderEntity.getId(), statusOrderEntity.getName());
    }

    @Override
    public StatusOrderEntity convertReverse(StatusOrder statusOrder) {
        return new StatusOrderEntity(statusOrder.getId(), statusOrder.getName());
    }
}
