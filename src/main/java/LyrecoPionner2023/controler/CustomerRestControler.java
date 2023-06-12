package LyrecoPionner2023.controler;

import LyrecoPionner2023.model.Customer;
import LyrecoPionner2023.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CustomerRestControler {

    @Autowired
    private CustomerService customerService;

    public CustomerRestControler(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping( "customer/{id}" )
    public Optional<Customer> findCustomerById(@PathVariable("id") Long id
    ){
        return customerService.findCustomerById(id);
    }

    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public List<Customer> listCustomers(){
        return customerService.customers();
    }

    @RequestMapping(value = "/customers/create", method = RequestMethod.POST)
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
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

