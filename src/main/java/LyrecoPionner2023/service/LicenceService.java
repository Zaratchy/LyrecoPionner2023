package LyrecoPionner2023.service;

import LyrecoPionner2023.model.Licence;

import java.util.List;
import java.util.Optional;

public interface LicenceService {

    Optional<Licence> findLicenceById(Long id);

    List<Licence> licences();

    Licence createLicence(Licence licence);

    Licence updateLicence(Licence licence , Long id);

    Licence deleteLicence(Licence licence);

}
