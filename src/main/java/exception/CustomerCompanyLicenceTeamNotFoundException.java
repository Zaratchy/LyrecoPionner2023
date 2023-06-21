package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomerCompanyLicenceTeamNotFoundException extends RuntimeException {

    private static final String CUSTOMERCOMPANYLICENCETEAM_NOT_FOUND = "CustomerCompanyLicenceTeam not found";
    private static final String CUSTOMERCOMPANYLICENCETEAM_DELETED = "Your customerCompanyLicenceTeam is deleted";

    public CustomerCompanyLicenceTeamNotFoundException(String message) {
        super(message);
    }

    public static CustomerCompanyLicenceTeamNotFoundException customerCompanyLicenceTeamNotFound() {
        return new CustomerCompanyLicenceTeamNotFoundException(CUSTOMERCOMPANYLICENCETEAM_NOT_FOUND);
    }

    public static CustomerCompanyLicenceTeamNotFoundException customerCompanyLicenceTeamSupprimee() {
        return new CustomerCompanyLicenceTeamNotFoundException(CUSTOMERCOMPANYLICENCETEAM_DELETED);
    }


}
