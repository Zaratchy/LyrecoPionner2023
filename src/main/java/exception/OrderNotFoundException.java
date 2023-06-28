package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class OrderNotFoundException extends Throwable {

    private static final String ORDER_NON_TROUVEE = "Commande non trouvée";
    private static final String ORDER_SUPPRIMEE = "Votre commande a été supprimée";

    public OrderNotFoundException(String message) {
        super(message);
    }

    public static OrderNotFoundException orderNotFound() {
        return new OrderNotFoundException(ORDER_NON_TROUVEE);
    }

    public static OrderNotFoundException orderSupprimee() {
        return new OrderNotFoundException(ORDER_SUPPRIMEE);
    }


}
