package LyrecoPionner2023.service.impl;


import LyrecoPionner2023.model.HistoCredential;
import LyrecoPionner2023.repository.HistoCredentialRepository;
import LyrecoPionner2023.service.HistoCredentialService;
import exception.HistoCredentialNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class HistoCredentialServiceImpl implements HistoCredentialService {

    private final HistoCredentialRepository histoCredentialRepository;

    public HistoCredentialServiceImpl(HistoCredentialRepository histoCredentialRepository) {
        this.histoCredentialRepository = histoCredentialRepository;
    }

    @Override
    public Optional<HistoCredential> findHistoCredentialById(Long id) {
        final Optional<HistoCredential> optionalHistoCredential = this.histoCredentialRepository.findById(id);

        if (optionalHistoCredential.isPresent()) {
            final HistoCredential histoCredential = optionalHistoCredential.get();
            return histoCredentialRepository.findById(id);
        } else {
            throw HistoCredentialNotFoundException.histoCredentialNotFound();
        }
    }

    @Override
    public List<HistoCredential> histoCredentials() {
        return histoCredentialRepository.findAll();


    }

    @Override
    public HistoCredential createHistoCredential(HistoCredential histoCredential) {
        histoCredentialRepository.save(histoCredential);
        return histoCredential;
    }
    @Override
    public HistoCredential updateHistoCredential(HistoCredential histoCredential, Long id) {
        histoCredential.setId(id);
        return  histoCredentialRepository.save(histoCredential);
    }

    @Transactional
    public HistoCredential deleteHistoCredential(HistoCredential histoCredential) {
        histoCredentialRepository.delete(histoCredential);
        return histoCredential;
    }

}
