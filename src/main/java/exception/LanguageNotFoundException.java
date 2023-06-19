package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class LanguageNotFoundException extends RuntimeException {

    private static final String LANGUAGE_NON_TROUVEE = "Language non trouvée";
    private static final String LANGUAGE_SUPPRIMEE = "Votre Language a été supprimée";

    public LanguageNotFoundException(String message) {
        super(message);
    }

    public static LanguageNotFoundException languageNotFound() {
        return new LanguageNotFoundException(LANGUAGE_NON_TROUVEE);
    }

    public static LanguageNotFoundException languageDeleted() {
        return new LanguageNotFoundException(LANGUAGE_SUPPRIMEE);
    }

}
