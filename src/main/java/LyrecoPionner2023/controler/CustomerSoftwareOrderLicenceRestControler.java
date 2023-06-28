package LyrecoPionner2023.controler;

import LyrecoPionner2023.model.*;
import LyrecoPionner2023.model.pk.CustomerSoftwareOrderLicencePk;
import LyrecoPionner2023.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CustomerSoftwareOrderLicenceRestControler {

    @Autowired
    private CustomerSoftwareOrderLicenceService customerSoftwareOrderLicenceService;


    public CustomerSoftwareOrderLicenceRestControler(CustomerSoftwareOrderLicenceService customerSoftwareOrderLicenceService, CustomerService customerService, SoftwareService softwareService, OrderService orderService, LicenceService licenceService) {
        this.customerSoftwareOrderLicenceService = customerSoftwareOrderLicenceService;

    }

    /* add Modified */

    @RequestMapping(value = "customerSoftwareOrderLicence/{idCustomer}/{idSoftware}/{idOrder}/{idLicence}", method = RequestMethod.GET)
    public Optional<CustomerSoftwareOrderLicence> findCustomerSoftwareOrderLicenceById(@PathVariable("idCustomer") @NotNull Long idCustomer,
                                                                                   @PathVariable("idSoftware") @NotNull Long idSoftware,
                                                                                   @PathVariable("idOrder") @NotNull Long idOrder,
                                                                                   @PathVariable("idLicence") @NotNull Long idLicence
    ) {
        return customerSoftwareOrderLicenceService.findCustomerSoftwareOrderLicenceById(new CustomerSoftwareOrderLicencePk(idCustomer, idSoftware, idOrder, idLicence));
    }

    @RequestMapping(value = "/CustomerSoftwareOrderLicences", method = RequestMethod.GET)
    public List<CustomerSoftwareOrderLicence> listCustomerSoftwareOrderLicences() {
        return customerSoftwareOrderLicenceService.listCustomerSoftwareOrderLicences();
    }


    @RequestMapping(value = "/customerSoftwareOrderLicence/create", method = RequestMethod.POST)
    public CustomerSoftwareOrderLicence createCustomerSoftwareOrderLicence(@RequestBody CustomerSoftwareOrderLicence customerSoftwareOrderLicence) {
        return customerSoftwareOrderLicenceService.createCustomerSoftwareOrderLicence(customerSoftwareOrderLicence);
    }

    /* add Modified */
    @RequestMapping(value = "/update/{idCustomer}/{idCompany}/{idLicence}/{idTeam}", method = RequestMethod.PUT)
    public CustomerSoftwareOrderLicence updateCustomerSoftwareOrderLicence(@RequestBody CustomerSoftwareOrderLicence customerSoftwareOrderLicence,
                                                                       @PathVariable("idCustomer") @NotNull Long idCustomer,
                                                                       @PathVariable("idSoftware") @NotNull Long idSoftware,
                                                                       @PathVariable("idOrder") @NotNull Long idOrder,
                                                                       @PathVariable("idLicence") @NotNull Long idLicence) {
        return customerSoftwareOrderLicenceService.updateCustomerSoftwareOrderLicence(customerSoftwareOrderLicence, new CustomerSoftwareOrderLicencePk(idCustomer, idSoftware, idOrder, idLicence));
    }

    /* add Modified */

    @RequestMapping(value = "/customerSoftwareOrderLicence/delete", method = RequestMethod.DELETE)
    public CustomerSoftwareOrderLicence deleteCustomerSoftwareOrderLicence(@RequestBody CustomerSoftwareOrderLicence customerSoftwareOrderLicence) {
        return customerSoftwareOrderLicenceService.deleteCustomerSoftwareOrderLicence(customerSoftwareOrderLicence);
    }



}
