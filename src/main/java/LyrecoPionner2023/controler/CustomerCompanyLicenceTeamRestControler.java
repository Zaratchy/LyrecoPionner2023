package LyrecoPionner2023.controler;

import LyrecoPionner2023.model.CustomerCompanyLicenceTeam;
import LyrecoPionner2023.model.pk.CustomerCompanyLicenceTeamPk;
import LyrecoPionner2023.service.CustomerCompanyLicenceTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CustomerCompanyLicenceTeamRestControler {

    @Autowired
    private CustomerCompanyLicenceTeamService customerCompanyLicenceTeamService;

    public CustomerCompanyLicenceTeamRestControler(CustomerCompanyLicenceTeamService customerCompanyLicenceTeamService) {
        this.customerCompanyLicenceTeamService = customerCompanyLicenceTeamService;
    }

 /* add Modified */

    @RequestMapping(value = "customerCompanyLicenceTeam/{idCustomer}/{idCompany}/{idLicence}/{idTeam}", method = RequestMethod.GET)
    public Optional<CustomerCompanyLicenceTeam> findCustomerCompanyLicenceTeamById(@PathVariable("idCustomer") @NotNull Long idCustomer,
                                                                                   @PathVariable("idCompany") @NotNull Long idCompany,
                                                                                   @PathVariable("idLicence") @NotNull Long idLicence,
                                                                                   @PathVariable("idTeam") @NotNull Long idTeam
    ) {
        return customerCompanyLicenceTeamService.findCustomerCompanyLicenceTeamById(new CustomerCompanyLicenceTeamPk(idCustomer, idCompany, idLicence, idTeam));
    }

    @RequestMapping(value = "/customerCompanyLicenceTeams", method = RequestMethod.GET)
    public List<CustomerCompanyLicenceTeam> listCustomerCompanyLicenceTeams() {
        return customerCompanyLicenceTeamService.customerCompanyLicenceTeams();
    }

    /* add Modified */

    @RequestMapping(value = "/customerCompanyLicenceTeams/create", method = RequestMethod.POST)
    public CustomerCompanyLicenceTeam createCustomerCompanyLicenceTeam(@RequestBody CustomerCompanyLicenceTeam customerCompanyLicenceTeam) {
        return customerCompanyLicenceTeamService.createCustomerCompanyLicenceTeam(customerCompanyLicenceTeam);
    }

    /* add Modified */
    @RequestMapping(value = "/customerCompanyLicenceTeam/{idCustomer}/{idCompany}/{idLicence}/{idTeam}", method = RequestMethod.PUT)
    public CustomerCompanyLicenceTeam updateCustomerCompanyLicenceTeam(@RequestBody CustomerCompanyLicenceTeam customerCompanyLicenceTeam,
                                                                       @PathVariable("idCustomer") @NotNull Long idCustomer,
                                                                       @PathVariable("idCompany") @NotNull Long idCompany,
                                                                       @PathVariable("idLicence") @NotNull Long idLicence,
                                                                       @PathVariable("idTeam") @NotNull Long idTeam) {
        return customerCompanyLicenceTeamService.updateCustomerCompanyLicenceTeam(customerCompanyLicenceTeam, new CustomerCompanyLicenceTeamPk(idCustomer, idCompany, idLicence, idTeam));
    }

    /* add Modified */

    @RequestMapping(value = "/customerCompanyLicenceTeam/delete", method = RequestMethod.DELETE)
    public CustomerCompanyLicenceTeam customerCompanyLicenceTeam(@RequestBody CustomerCompanyLicenceTeam customerCompanyLicenceTeam) {
        return customerCompanyLicenceTeamService.deleteCustomerCompanyLicenceTeam(customerCompanyLicenceTeam);
    }


}
