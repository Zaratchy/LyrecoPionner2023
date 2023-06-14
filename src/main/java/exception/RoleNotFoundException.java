package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RoleNotFoundException extends RuntimeException {

    private static final String ROLE_NON_TROUVEE = "Role non trouvée";
    private static final String ROLE_SUPPRIMEE = "Votre Role a été supprimée";

    public RoleNotFoundException(String message) {
        super(message);
    }

    public static RoleNotFoundException roleNotFound() {
        return new RoleNotFoundException(ROLE_NON_TROUVEE);
    }

    public static RoleNotFoundException roleDeleted() {
        return new RoleNotFoundException(ROLE_SUPPRIMEE);
    }

}
