package LyrecoPionner2023.service.impl;

import LyrecoPionner2023.model.CustomerSoftwareOrderLicence;
import LyrecoPionner2023.model.pk.CustomerSoftwareOrderLicencePk;
import LyrecoPionner2023.repository.CustomerSoftwareOrderLicenceRepository;
import LyrecoPionner2023.service.CustomerSoftwareOrderLicenceService;
import exception.CustomerSoftwareOrderLicenceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerSoftwareOrderLicenceServiceImpl implements CustomerSoftwareOrderLicenceService {

    private final CustomerSoftwareOrderLicenceRepository customerSoftwareOrderLicenceRepository;


    public CustomerSoftwareOrderLicenceServiceImpl(CustomerSoftwareOrderLicenceRepository customerSoftwareOrderLicenceRepository) {
        this.customerSoftwareOrderLicenceRepository = customerSoftwareOrderLicenceRepository;
    }

    @Override
    public Optional<CustomerSoftwareOrderLicence> findCustomerSoftwareOrderLicenceById(CustomerSoftwareOrderLicencePk id){
        final Optional<CustomerSoftwareOrderLicence> optionalCustomerSoftwareOrderLicence = this.customerSoftwareOrderLicenceRepository.findById(id);

        if (optionalCustomerSoftwareOrderLicence.isPresent()) {
            final CustomerSoftwareOrderLicence customerSoftwareOrderLicence = optionalCustomerSoftwareOrderLicence.get();
            return customerSoftwareOrderLicenceRepository.findById(id);
        } else {
            throw  CustomerSoftwareOrderLicenceNotFoundException.CustomerSoftwareOrderLicenceNotFound();
        }
    }

    @Override
    public List<CustomerSoftwareOrderLicence> listCustomerSoftwareOrderLicences() {
        return customerSoftwareOrderLicenceRepository.findAll();

    }

    @Override
    public CustomerSoftwareOrderLicence createCustomerSoftwareOrderLicence(CustomerSoftwareOrderLicence customerSoftwareOrderLicence) {
        customerSoftwareOrderLicenceRepository.save(customerSoftwareOrderLicence);
        return customerSoftwareOrderLicence;
    }
    @Override
    public CustomerSoftwareOrderLicence updateCustomerSoftwareOrderLicence(CustomerSoftwareOrderLicence customerSoftwareOrderLicence, CustomerSoftwareOrderLicencePk customerSoftwareOrderLicencePk) {
        customerSoftwareOrderLicence.setId(customerSoftwareOrderLicencePk);
        return customerSoftwareOrderLicenceRepository.save(customerSoftwareOrderLicence);
    }

    @Transactional
    public CustomerSoftwareOrderLicence deleteCustomerSoftwareOrderLicence(CustomerSoftwareOrderLicence customerSoftwareOrderLicence) {
        customerSoftwareOrderLicenceRepository.delete(customerSoftwareOrderLicence);
        return customerSoftwareOrderLicence;
    }


}
