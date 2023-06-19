package LyrecoPionner2023.repository;

import LyrecoPionner2023.model.CustomerCompanyLicenceTeam;
import LyrecoPionner2023.model.pk.CustomerCompanyLicenceTeamPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerCompanyLicenceTeamRepository extends JpaRepository <CustomerCompanyLicenceTeam, CustomerCompanyLicenceTeamPk> {

    Optional<CustomerCompanyLicenceTeam> findById(CustomerCompanyLicenceTeamPk id);


}
