package com.store.service.impl.order;

import com.store.model.order.Orders;
import com.store.service.Service;

import java.util.List;

@org.springframework.stereotype.Service
public class OrderServiceImpl implements Service<Orders> {
    @Override
    public List<Orders> getAll() {
        return null;
    }

    @Override
    public void add(Orders order) {

    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

    @Override
    public void edit(Orders order) {

    }

    @Override
    public Orders getById(long id) {
        return null;
    }
//    private OrderRepository orderRepository;
//    private ClientRepository clientRepository;
//    private ProductRepository productRepository;
//    private IConverter<OrderEntity, Order> orderConverter;
//
//
//    @Override
//    public List<Order> getAll() {
//        return orderConverter.convertAll(orderRepository.findAll());
//    }
//
//    @Override
//    public void add(Order order) {
//        orderRepository.save(orderConverter.convertReverse(order)) ;
//    }
//
//    @Override
//    public boolean deleteById(long id) {
//        orderRepository.deleteById(id);
//        if (orderRepository.getOne(id) == null){
//            return true;
//        } else{
//            return false;
//        }
//    }
//
//    @Override
//    public void edit(Order order) {
//        ClientEntity clientEntity = clientRepository.getOne(order.getProduct().getId());
//        ProductEntity productEntity = productRepository.getOne(order.getProduct().getId());
//        OrderEntity orderEntity = orderConverter.convertReverse(order);
//        orderEntity.setClientEntity(clientEntity);
//        orderEntity.setProductEntity(productEntity);
//        orderRepository.save(orderEntity);
//    }
//
//    @Override
//    public Order getById(long id) {
//        return orderConverter.convert(orderRepository.findById(id).get());
//    }
//
//    @Autowired
//    public void setOrderRepository(OrderRepository orderRepository){
//        this.orderRepository = orderRepository;
//    }
//
//    @Autowired
//    public void setClientRepository(ClientRepository clientRepository){
//        this.clientRepository = clientRepository;
//    }
//
//    @Autowired
//    public void setProductRepository(ProductRepository productRepository){
//        this.productRepository = productRepository;
//    }
//
//    @Autowired
//    public void setOrderConverter(IConverter<OrderEntity, Order> orderConverter) {
//        this.orderConverter = orderConverter;
//    }
}
