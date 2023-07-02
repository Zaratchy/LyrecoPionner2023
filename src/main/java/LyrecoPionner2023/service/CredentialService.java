package LyrecoPionner2023.service;

import LyrecoPionner2023.model.Credential;

import java.util.List;
import java.util.Optional;

public interface CredentialService {

    Optional<Credential> findCredentialById(Long id);

    List<Credential> credentials();

    Credential createCredential(Credential credential);

    Credential updateCredential(Credential credential , Long id);

    Credential deleteCredential(Credential credential);

}
