package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomerSoftwareOrderLicenceNotFoundException extends RuntimeException {

    private static final String CUSTOMERSOFTWAREORDERLICENCE_NOT_FOUND = "CustomerSoftwareOrderLicence not found";
    private static final String CUSTOMERSOFTWAREORDERLICENCE_DELETED = "Your customerSoftwareOrderLicence is deleted";

    public CustomerSoftwareOrderLicenceNotFoundException(String message) {
        super(message);
    }

    public static CustomerSoftwareOrderLicenceNotFoundException CustomerSoftwareOrderLicenceNotFound() {
        return new CustomerSoftwareOrderLicenceNotFoundException(CUSTOMERSOFTWAREORDERLICENCE_NOT_FOUND);
    }

    public static CustomerSoftwareOrderLicenceNotFoundException CustomerSoftwareOrderLicenceSupprimee() {
        return new CustomerSoftwareOrderLicenceNotFoundException(CUSTOMERSOFTWAREORDERLICENCE_DELETED);
    }


}
