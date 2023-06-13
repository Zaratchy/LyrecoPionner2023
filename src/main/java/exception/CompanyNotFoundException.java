package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CompanyNotFoundException extends Throwable {

    private static final String COMPANY_NON_TROUVEE = "Company non trouvée";
    private static final String COMPANY_SUPPRIMEE = "Votre Entreprise a été supprimée";

    public CompanyNotFoundException(String message) {
        super(message);
    }

    public static CompanyNotFoundException companyNotFound() {
        return new CompanyNotFoundException(COMPANY_NON_TROUVEE);
    }

    public static CompanyNotFoundException companySupprimee() {
        return new CompanyNotFoundException(COMPANY_SUPPRIMEE);
    }


}
