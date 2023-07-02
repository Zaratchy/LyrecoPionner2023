package LyrecoPionner2023.service;

import LyrecoPionner2023.model.CustomerSoftwareOrderLicence;
import LyrecoPionner2023.model.pk.CustomerSoftwareOrderLicencePk;

import java.util.List;
import java.util.Optional;

public interface CustomerSoftwareOrderLicenceService {

    Optional<CustomerSoftwareOrderLicence> findCustomerSoftwareOrderLicenceById(CustomerSoftwareOrderLicencePk id);

    List<CustomerSoftwareOrderLicence> listCustomerSoftwareOrderLicences();

    CustomerSoftwareOrderLicence createCustomerSoftwareOrderLicence(CustomerSoftwareOrderLicence customerSoftwareOrderLicence);

    CustomerSoftwareOrderLicence updateCustomerSoftwareOrderLicence(CustomerSoftwareOrderLicence customerSoftwareOrderLicence, CustomerSoftwareOrderLicencePk customerSoftwareOrderLicencePk);

    CustomerSoftwareOrderLicence deleteCustomerSoftwareOrderLicence(CustomerSoftwareOrderLicence customerSoftwareOrderLicence);



}
