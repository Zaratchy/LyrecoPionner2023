package LyrecoPionner2023.controler;

import LyrecoPionner2023.model.Customer;
import LyrecoPionner2023.repository.CustomerRepository;
import LyrecoPionner2023.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CustomerRestControler {

    private final CustomerService customerService;

    public CustomerRestControler(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping( "customer/{id}" )
    public Optional<Customer> findCustomerById(@PathVariable("id") Long id
    ){
        return customerService.findCustomerById(id);
    }

    private final List<Customer> customers = new ArrayList<>();
    @GetMapping
    public List<Customer> findAllCustomers() {
        return customers;

    }

    @PostMapping
    public Customer saveCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.PUT)
    public Customer updateCustomer(@RequestBody Customer customer , @PathVariable("id") @NotNull Long id ){
        return customerService.updateCustomer(customer,id);
    }

    @RequestMapping(value = "/customers/delete", method = RequestMethod.DELETE)
    public Customer customer(@RequestBody Customer customer) {
        return customerService.deleteCustomer(customer);
    }

}

