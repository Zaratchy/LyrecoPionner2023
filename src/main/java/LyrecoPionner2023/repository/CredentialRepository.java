package LyrecoPionner2023.repository;

import LyrecoPionner2023.model.Credential;
import LyrecoPionner2023.model.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CredentialRepository extends JpaRepository <Credential,Long> {

    Optional<Credential> findById(Long id);

}
