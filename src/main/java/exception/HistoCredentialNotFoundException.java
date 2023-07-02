package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class HistoCredentialNotFoundException extends RuntimeException {

    private static final String HistoCredential_NON_TROUVEE = "HistoCredential non trouvée";
    private static final String HistoCredential_SUPPRIMEE = "Votre HistoCredential a été supprimée";

    public HistoCredentialNotFoundException(String message) {
        super(message);
    }

    public static HistoCredentialNotFoundException histoCredentialNotFound() {
        return new HistoCredentialNotFoundException(HistoCredential_NON_TROUVEE);
    }

    public static HistoCredentialNotFoundException agenceSupprimee() {
        return new HistoCredentialNotFoundException(HistoCredential_SUPPRIMEE);
    }

}
