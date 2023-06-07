package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException {


    private static final String CUSTOMER_NON_TROUVEE = "Customer non trouvée";
    private static final String CUSTOMER_SUPPRIMEE = "Votre Customer a été supprimée";

    public CustomerNotFoundException(String message) {
        super(message);
    }

    public static CustomerNotFoundException customerNotFound() {
        return new CustomerNotFoundException(CUSTOMER_NON_TROUVEE);
    }

    public static CustomerNotFoundException agenceSupprimee() {
        return new CustomerNotFoundException(CUSTOMER_SUPPRIMEE);
    }

}



