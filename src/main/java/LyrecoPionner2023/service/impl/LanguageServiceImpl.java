package LyrecoPionner2023.service.impl;


import LyrecoPionner2023.model.Language;
import LyrecoPionner2023.repository.LanguageRepository;
import LyrecoPionner2023.service.LanguageService;
import exception.LanguageNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageServiceImpl implements LanguageService {

    private final LanguageRepository languageRepository;

    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public Optional<Language> findLanguageById(Long id) {
        final Optional<Language> optionalLanguage = this.languageRepository.findById(id);

        if (optionalLanguage.isPresent()) {
            final Language language = optionalLanguage.get();
            return languageRepository.findById(id);
        } else {
            throw LanguageNotFoundException.languageNotFound();
        }
    }

    @Override
    public List<Language> languages() {
        return languageRepository.findAll();


    }

    @Override
    public Language createLanguage(Language language) {
        languageRepository.save(language);
        return language;
    }
    @Override
    public Language updateLanguage(Language language, Long id) {
        language.setId(id);
        return  languageRepository.save(language);
    }

    @Transactional
    public Language deleteLanguage(Language language) {
        languageRepository.delete(language);
        return language;
    }

}
