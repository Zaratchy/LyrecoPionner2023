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
public class CustomerCompanyLicenceTeamPk implements Serializable {

    private Long idCustomer;
    private Long idCompany;
    private Long idLicence;
    private Long idTeam;

}

