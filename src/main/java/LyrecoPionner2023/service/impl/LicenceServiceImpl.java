package LyrecoPionner2023.service.impl;

import LyrecoPionner2023.model.Licence;
import LyrecoPionner2023.repository.LicenceRepository;
import LyrecoPionner2023.service.LicenceService;
import exception.LicenceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class LicenceServiceImpl implements LicenceService {

    private final LicenceRepository licenceRepository;

    public LicenceServiceImpl(LicenceRepository licenceRepository) {
        this.licenceRepository = licenceRepository;
    }

    @Override
    public Optional<Licence> findLicenceById(Long id) {
        final Optional<Licence> optionalLicence = this.licenceRepository.findById(id);

        if (optionalLicence.isPresent()) {
            final Licence licence = optionalLicence.get();
            return licenceRepository.findById(id);
        } else {
            throw LicenceNotFoundException.licenceNotFound();
        }
    }

    @Override
    public List<Licence> licences() {
        return licenceRepository.findAll();


    }

    @Override
    public Licence createLicence(Licence licence) {
        licenceRepository.save(licence);
        return licence;
    }
    @Override
    public Licence updateLicence(Licence licence, Long id) {
        licence.setId(id);
        return  licenceRepository.save(licence);
    }

    @Transactional
    public Licence deleteLicence(Licence licence) {
        licenceRepository.delete(licence);
        return licence;
    }

}
