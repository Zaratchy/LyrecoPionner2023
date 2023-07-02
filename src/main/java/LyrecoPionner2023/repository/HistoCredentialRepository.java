package LyrecoPionner2023.repository;

import LyrecoPionner2023.model.HistoCredential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HistoCredentialRepository extends JpaRepository <HistoCredential,Long> {

    Optional<HistoCredential> findById(Long id);

}
