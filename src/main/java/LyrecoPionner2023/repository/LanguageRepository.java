package LyrecoPionner2023.repository;


import LyrecoPionner2023.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LanguageRepository extends JpaRepository <Language,Long> {

    Optional<Language> findById(Long id);



}
