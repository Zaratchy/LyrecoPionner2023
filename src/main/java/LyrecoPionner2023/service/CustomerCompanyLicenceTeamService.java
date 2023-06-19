package LyrecoPionner2023.service;


import LyrecoPionner2023.model.CustomerCompanyLicenceTeam;
import LyrecoPionner2023.model.pk.CustomerCompanyLicenceTeamPk;
import exception.CustomerCompanyLicenceTeamNotFoundException;

import java.util.List;
import java.util.Optional;

public interface CustomerCompanyLicenceTeamService {

    Optional<CustomerCompanyLicenceTeam> findCustomerCompanyLicenceTeamById(CustomerCompanyLicenceTeamPk id);

    List<CustomerCompanyLicenceTeam> customerCompanyLicenceTeams();

    CustomerCompanyLicenceTeam createCustomerCompanyLicenceTeam(CustomerCompanyLicenceTeam customerCompanyLicenceTeam);

    CustomerCompanyLicenceTeam updateCustomerCompanyLicenceTeam(CustomerCompanyLicenceTeam customerCompanyLicenceTeam, CustomerCompanyLicenceTeamPk customerCompanyLicenceTeamPk);

    CustomerCompanyLicenceTeam deleteCustomerCompanyLicenceTeam(CustomerCompanyLicenceTeam customerCompanyLicenceTeam);

}
