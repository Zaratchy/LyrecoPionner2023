package LyrecoPionner2023.service.impl;

import LyrecoPionner2023.model.Customer;
import LyrecoPionner2023.repository.CustomerRepository;
import LyrecoPionner2023.service.CustomerService;
import exception.CustomerNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Optional<Customer> findCustomerById(Long id) {
        final Optional<Customer> optionalCustomer = this.customerRepository.findById(id);

        if (optionalCustomer.isPresent()) {
            final Customer customer = optionalCustomer.get();
            return customerRepository.findById(id);
        } else {
            throw CustomerNotFoundException.customerNotFound();
        }
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer, Long id) {
        customer.setId(id);
        return  customerRepository.save(customer);
    }

    @Transactional
    public Customer deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
        return customer;
    }

}
