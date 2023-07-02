package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CredentialNotFoundException extends RuntimeException {

    private static final String CREDENTIAL_NON_TROUVEE = "Credential non trouvée";
    private static final String CREDENTIAL_SUPPRIMEE = "Votre Credential a été supprimée";

    public CredentialNotFoundException(String message) {
        super(message);
    }

    public static CredentialNotFoundException credentialNotFound() {
        return new CredentialNotFoundException(CREDENTIAL_NON_TROUVEE);
    }

    public static CredentialNotFoundException credentialDelleted() {
        return new CredentialNotFoundException(CREDENTIAL_SUPPRIMEE);
    }

}
