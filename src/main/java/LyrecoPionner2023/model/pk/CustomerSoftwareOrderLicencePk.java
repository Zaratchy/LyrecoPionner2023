package LyrecoPionner2023.model.pk;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CustomerSoftwareOrderLicencePk implements Serializable {

    private Long idCustomer;
    private Long idSoftware;
    private Long idOrder;
    private Long idLicence;


}
