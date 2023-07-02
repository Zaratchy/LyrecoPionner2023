package LyrecoPionner2023.repository;

import LyrecoPionner2023.model.CustomerSoftwareOrderLicence;
import LyrecoPionner2023.model.pk.CustomerSoftwareOrderLicencePk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CustomerSoftwareOrderLicenceRepository extends JpaRepository <CustomerSoftwareOrderLicence, CustomerSoftwareOrderLicencePk> {

    Optional<CustomerSoftwareOrderLicence> findById(CustomerSoftwareOrderLicencePk id);


}
