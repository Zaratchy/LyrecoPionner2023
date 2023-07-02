package LyrecoPionner2023.service.impl;

import LyrecoPionner2023.model.Credential;
import LyrecoPionner2023.repository.CredentialRepository;
import LyrecoPionner2023.service.CredentialService;
import LyrecoPionner2023.service.CustomerService;
import exception.CredentialNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CredentialServiceImpl implements CredentialService {

    private final CredentialRepository credentialRepository;

    public CredentialServiceImpl(CredentialRepository credentialRepository) {
        this.credentialRepository = credentialRepository;
    }

    @Override
    public Optional<Credential> findCredentialById(Long id) {
        final Optional<Credential> optionalCredential = this.credentialRepository.findById(id);

        if (optionalCredential.isPresent()) {
            final Credential credential = optionalCredential.get();
            return credentialRepository.findById(id);
        } else {
            throw CredentialNotFoundException.credentialNotFound();
        }
    }

    @Override
    public List<Credential> credentials() {
        return credentialRepository.findAll();


    }

    @Override
    public Credential createCredential(Credential credential) {
        credentialRepository.save(credential);
        return credential;
    }
    @Override
    public Credential updateCredential(Credential credential, Long id) {
        credential.setId(id);
        return  credentialRepository.save(credential);
    }

    @Transactional
    public Credential deleteCredential(Credential credential) {
        credentialRepository.delete(credential);
        return credential;
    }

}
