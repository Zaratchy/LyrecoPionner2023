package LyrecoPionner2023.service.impl;

import LyrecoPionner2023.model.CustomerCompanyLicenceTeam;
import LyrecoPionner2023.model.pk.CustomerCompanyLicenceTeamPk;
import LyrecoPionner2023.repository.CustomerCompanyLicenceTeamRepository;
import LyrecoPionner2023.service.CustomerCompanyLicenceTeamService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerCompanyLicenceTeamServiceImpl implements CustomerCompanyLicenceTeamService {


    private final CustomerCompanyLicenceTeamRepository customerCompanyLicenceTeamRepository;


    public CustomerCompanyLicenceTeamServiceImpl(CustomerCompanyLicenceTeamRepository customerCompanyLicenceTeamRepository) {
        this.customerCompanyLicenceTeamRepository = customerCompanyLicenceTeamRepository;
    }

    @Override
    public Optional<CustomerCompanyLicenceTeam> findCustomerCompanyLicenceTeamById(CustomerCompanyLicenceTeamPk id){
        final Optional<CustomerCompanyLicenceTeam> optionalCustomerCompanyLicenceTeam = this.customerCompanyLicenceTeamRepository.findById(id);

        if (optionalCustomerCompanyLicenceTeam.isPresent()) {
            final CustomerCompanyLicenceTeam customerCompanyLicenceTeam = optionalCustomerCompanyLicenceTeam.get();
            return customerCompanyLicenceTeamRepository.findById(id);
        }
        return optionalCustomerCompanyLicenceTeam;
    }

    @Override
    public List<CustomerCompanyLicenceTeam> customerCompanyLicenceTeams() {
        return customerCompanyLicenceTeamRepository.findAll();

    }

    @Override
    public CustomerCompanyLicenceTeam createCustomerCompanyLicenceTeam(CustomerCompanyLicenceTeam customerCompanyLicenceTeam) {
        customerCompanyLicenceTeamRepository.save(customerCompanyLicenceTeam);
        return customerCompanyLicenceTeam;
    }
    @Override
    public CustomerCompanyLicenceTeam updateCustomerCompanyLicenceTeam(CustomerCompanyLicenceTeam customerCompanyLicenceTeam,CustomerCompanyLicenceTeamPk id) {
        customerCompanyLicenceTeam.setId(id);
        return  customerCompanyLicenceTeamRepository.save(customerCompanyLicenceTeam);
    }

    @Transactional
    public CustomerCompanyLicenceTeam deleteCustomerCompanyLicenceTeam(CustomerCompanyLicenceTeam customerCompanyLicenceTeam) {
        customerCompanyLicenceTeamRepository.delete(customerCompanyLicenceTeam);
        return customerCompanyLicenceTeam;
    }

}
