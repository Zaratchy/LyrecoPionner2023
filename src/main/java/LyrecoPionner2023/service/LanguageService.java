package LyrecoPionner2023.service;

import LyrecoPionner2023.model.Language;

import java.util.List;
import java.util.Optional;

public interface LanguageService {

    Optional<Language> findLanguageById(Long id);

    List<Language> languages();

    Language createLanguage(Language language);

    Language updateLanguage(Language language , Long id);

    Language deleteLanguage(Language language);


}
