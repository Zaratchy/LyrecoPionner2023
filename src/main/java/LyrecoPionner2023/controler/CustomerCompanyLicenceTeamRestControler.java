package LyrecoPionner2023.controler;

import LyrecoPionner2023.model.*;
import LyrecoPionner2023.model.pk.CustomerCompanyLicenceTeamPk;
import LyrecoPionner2023.service.*;
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


    public CustomerCompanyLicenceTeamRestControler(CustomerCompanyLicenceTeamService customerCompanyLicenceTeamService, CustomerService customerService, CompanyService companyService, LicenceService licenceService, TeamService teamService) {
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
        return customerCompanyLicenceTeamService.listCustomerCompanyLicenceTeams();
    }





   /* @RequestMapping(value = "/customerCompanyLicenceTeam/create", method = RequestMethod.POST)
    public CustomerCompanyLicenceTeam createCustomerCompanyLicenceTeam(@RequestParam (name = "idCustomer") String idCustomer,
                                                                       @RequestParam (name="idCompany") String idCompany,
                                                                       @RequestParam (name="idLicence") String idLicence,
                                                                       @RequestParam (name="idTeam") String idTeam){
        Customer customer = new Customer();
        customer.setId(Long.valueOf(idCustomer));

        Company company = new Company();
        company.setId(Long.valueOf(idCompany));

        Licence licence = new Licence();
        licence.setId(Long.valueOf(idLicence));

        Team team = new Team();
        team.setId(Long.valueOf(idTeam));

        CustomerCompanyLicenceTeam customerCompanyLicenceTeam = new CustomerCompanyLicenceTeam();
        customerCompanyLicenceTeam.setCustomer(customer);
        customerCompanyLicenceTeam.setCompany(company);
        customerCompanyLicenceTeam.setLicence(licence);
        customerCompanyLicenceTeam.setTeam(team);

        return customerCompanyLicenceTeamService.createCustomerCompanyLicenceTeam(customerCompanyLicenceTeam);
    }

*/


    @RequestMapping(value = "/customerCompanyLicenceTeam/create", method = RequestMethod.POST)
    public CustomerCompanyLicenceTeam createCustomerCompanyLicenceTeam(@RequestBody CustomerCompanyLicenceTeam customerCompanyLicenceTeam) {
        return customerCompanyLicenceTeamService.createCustomerCompanyLicenceTeam(customerCompanyLicenceTeam);
    }

    /* add Modified */
    @RequestMapping(value = "/update/{idCustomer}/{idCompany}/{idLicence}/{idTeam}", method = RequestMethod.PUT)
    public CustomerCompanyLicenceTeam updateCustomerCompanyLicenceTeam(@RequestBody CustomerCompanyLicenceTeam customerCompanyLicenceTeam,
                                                                       @PathVariable("idCustomer") @NotNull Long idCustomer,
                                                                       @PathVariable("idCompany") @NotNull Long idCompany,
                                                                       @PathVariable("idLicence") @NotNull Long idLicence,
                                                                       @PathVariable("idTeam") @NotNull Long idTeam) {
        return customerCompanyLicenceTeamService.updateCustomerCompanyLicenceTeam(customerCompanyLicenceTeam, new CustomerCompanyLicenceTeamPk(idCustomer, idCompany, idLicence, idTeam));
    }

    /* add Modified */

    @RequestMapping(value = "/customerCompanyLicenceTeam/delete", method = RequestMethod.DELETE)
    public CustomerCompanyLicenceTeam deleteCustomerCompanyLicenceTeam(@RequestBody CustomerCompanyLicenceTeam customerCompanyLicenceTeam) {
        return customerCompanyLicenceTeamService.deleteCustomerCompanyLicenceTeam(customerCompanyLicenceTeam);
    }


}
