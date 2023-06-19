package LyrecoPionner2023.controler;


import LyrecoPionner2023.model.Language;
import LyrecoPionner2023.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LanguageRestControler {

    @Autowired
    private LanguageService languageService;

    public LanguageRestControler(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping( "language/{id}" )
    public Optional<Language> findLanguageById(@PathVariable("id") Long id
    ){
        return languageService.findLanguageById(id);
    }

    @RequestMapping(value = "/languages", method = RequestMethod.GET)
    public List<Language> listLanguages(){
        return languageService.languages();
    }

    @RequestMapping(value = "/languages/create", method = RequestMethod.POST)
    public Language createLanguage(@RequestBody Language language){
        return languageService.createLanguage(language);
    }
    @RequestMapping(value = "/languages/{id}", method = RequestMethod.PUT)
    public Language updateLanguage(@RequestBody Language language , @PathVariable("id") @NotNull Long id ){
        return languageService.updateLanguage(language,id);
    }

    @RequestMapping(value = "/languages/delete", method = RequestMethod.DELETE)
    public Language language(@RequestBody Language language) {
        return languageService.deleteLanguage(language);
    }

}
