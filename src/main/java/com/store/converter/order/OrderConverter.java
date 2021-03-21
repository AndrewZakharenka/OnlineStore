package com.store.converter.order;

import com.store.converter.AbstractConverter;

import com.store.converter.personalData.PersonalDataConverter;
import com.store.converter.product.ProductConverter;
import com.store.converter.productBrand.ProductBrandConverter;
import com.store.converter.statusOrder.StatusOrderConverter;
import com.store.converter.user.UserConverter;
import com.store.model.order.Orders;
import com.store.entity.order.OrdersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderConverter extends AbstractConverter<OrdersEntity, Orders> {

    private UserConverter userConverter;
    private PersonalDataConverter personalDataConverter;
    private StatusOrderConverter statusOrderConverter;
    private ProductConverter productConverter;

    @Override
    public Orders convert(OrdersEntity orderEntity) {
        return new Orders(orderEntity.getId(), orderEntity.getTotalPrice(),
                orderEntity.getComment(), orderEntity.getDate(),
                userConverter.convert(orderEntity.getUserEntity()),
                personalDataConverter.convert(orderEntity.getPersonalData()),
                statusOrderConverter.convert(orderEntity.getStatus()),
                productConverter.convertSet(orderEntity.getProducts()));
    }

    @Override
    public OrdersEntity convertReverse(Orders order) {
        return new OrdersEntity(order.getId(), order.getTotalPrice(),
                order.getComment(), order.getDate(),
                userConverter.convertReverse(order.getUser()),
                personalDataConverter.convertReverse(order.getPersonalData()),
                statusOrderConverter.convertReverse(order.getStatus()),
                productConverter.convertSetReverse(order.getProducts()));
    }

    @Autowired
    public void setPersonalDataConverter(PersonalDataConverter personalDataConverter) {
        this.personalDataConverter = personalDataConverter;
    }

    @Autowired
    public void setProductConverter(ProductConverter productConverter) {
        this.productConverter = productConverter;
    }

    @Autowired
    public void setStatusOrderConverter(StatusOrderConverter statusOrderConverter) {
        this.statusOrderConverter = statusOrderConverter;
    }

    @Autowired
    public void setUserConverter(UserConverter userConverter) {
        this.userConverter = userConverter;
    }
}
