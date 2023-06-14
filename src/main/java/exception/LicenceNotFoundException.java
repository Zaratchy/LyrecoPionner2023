package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class LicenceNotFoundException extends RuntimeException {

    private static final String LICENCE_NON_TROUVEE = "Licence non trouvée";
    private static final String LICENCE_SUPPRIMEE = "Votre Licence a été supprimée";

    public LicenceNotFoundException(String message) {
        super(message);
    }

    public static LicenceNotFoundException licenceNotFound() {
        return new LicenceNotFoundException(LICENCE_NON_TROUVEE);
    }

    public static LicenceNotFoundException agenceSupprimee() {
        return new LicenceNotFoundException(LICENCE_SUPPRIMEE);
    }

}
