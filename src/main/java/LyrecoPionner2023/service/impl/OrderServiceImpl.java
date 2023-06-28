package LyrecoPionner2023.service.impl;

import LyrecoPionner2023.model.Order;
import LyrecoPionner2023.repository.OrderRepository;
import LyrecoPionner2023.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {


    private final OrderRepository orderRepository;


    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Optional<Order> findOrderById(Long id) {
        final Optional<Order> optionalOrder = this.orderRepository.findById(id);

        if (optionalOrder.isPresent()) {
            final Order order = optionalOrder.get();
            return orderRepository.findById(id);
        }
        return optionalOrder;
    }

    @Override
    public List<Order> orders() {
        return orderRepository.findAll();

    }

    @Override
    public Order createOrder(Order order) {
        orderRepository.save(order);
        return order;
    }
    @Override
    public Order updateOrder(Order order, Long id) {
        order.setId(id);
        return  orderRepository.save(order);
    }

    @Transactional
    public Order deleteOrder(Order order) {
        orderRepository.delete(order);
        return order;
    }


}
