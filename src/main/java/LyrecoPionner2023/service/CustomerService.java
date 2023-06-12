package LyrecoPionner2023.service;


import LyrecoPionner2023.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Optional<Customer> findCustomerById(Long id);

    List<Customer> customers();

    Customer createCustomer(Customer customer);

    Customer updateCustomer(Customer customer , Long id);

    Customer deleteCustomer(Customer customer);

}
