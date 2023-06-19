package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SoftwareNotFoundException extends RuntimeException {

    private static final String SOFTWARE_NON_TROUVEE = "Software non trouvée";
    private static final String SOFTWARE_SUPPRIMEE = "Votre Software a été supprimée";

    public SoftwareNotFoundException(String message) {
        super(message);
    }

    public static SoftwareNotFoundException SoftwareNotFound() {
        return new SoftwareNotFoundException(SOFTWARE_NON_TROUVEE);
    }

    public static SoftwareNotFoundException agenceSupprimee() {
        return new SoftwareNotFoundException(SOFTWARE_SUPPRIMEE);
    }

}
