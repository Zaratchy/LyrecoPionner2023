package LyrecoPionner2023.controler;

import LyrecoPionner2023.model.Order;
import LyrecoPionner2023.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class OrderRestControler {

    @Autowired
    private OrderService orderService;

    public OrderRestControler(OrderService orderService) { this.orderService = orderService;}

    @GetMapping( "order/{id}" )
    public Optional<Order> findOrderById(@PathVariable("id") Long id
    ){
        return orderService.findOrderById(id);
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public List<Order> listOrders () {
        return orderService.orders();
    }

    @RequestMapping(value = "/orders/create", method = RequestMethod.POST)
    public Order createOrder (@RequestBody Order order){ return orderService.createOrder(order);
    }
    @RequestMapping(value = "/order/{id}", method = RequestMethod.PUT)
    public Order updateOrder (@RequestBody Order order, @PathVariable("id") @NotNull Long id ){
        return orderService.updateOrder(order, id);
    }

    @RequestMapping(value = "/orders/delete", method = RequestMethod.DELETE)
    public Order order (@RequestBody Order order){ return orderService.deleteOrder(order);}

}
