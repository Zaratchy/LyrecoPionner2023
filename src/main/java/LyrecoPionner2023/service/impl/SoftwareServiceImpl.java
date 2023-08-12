package LyrecoPionner2023.service.impl;


import LyrecoPionner2023.model.Software;
import LyrecoPionner2023.repository.SoftwareRepository;
import LyrecoPionner2023.service.SoftwareService;
import exception.SoftwareNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SoftwareServiceImpl implements SoftwareService {

    private final SoftwareRepository softwareRepository;

    public SoftwareServiceImpl(SoftwareRepository softwareRepository) {
        this.softwareRepository = softwareRepository;
    }

    @Override
    public Optional<Software> findSoftwareById(Long id) {
        final Optional<Software> optionalSoftware = this.softwareRepository.findById(id);

        if (optionalSoftware.isPresent()) {
            final Software software = optionalSoftware.get();
            return softwareRepository.findById(id);
        } else {
            throw SoftwareNotFoundException.SoftwareNotFound();
        }
    }

    @Override
    public List<Software> softwares() {
        return softwareRepository.findAll();


    }

    @Override
    public Software createSoftware(Software software) {
        softwareRepository.save(software);
        return software;
    }
    @Override
    public Software updateSoftware(Software software, Long id) {
        software.setId(id);
        return  softwareRepository.save(software);
    }

    @Override
    public Software deleteSoftware(Software software, Long id) {
        softwareRepository.delete(software);
        return software;
    }


}
