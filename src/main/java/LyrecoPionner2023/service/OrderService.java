package LyrecoPionner2023.service;

import LyrecoPionner2023.model.Order;

import java.util.List;
import java.util.Optional;
public interface OrderService {


    Optional<Order> findOrderById(Long id);

    List<Order> orders();

    Order createOrder(Order order);

    Order updateOrder(Order order , Long id);

    Order deleteOrder(Order order);


}
