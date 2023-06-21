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
/*
    public CustomerCompanyLicenceTeamPk() {

    }
    */
/*
    public CustomerCompanyLicenceTeamPk(Long idCustomer, Long idCompany, Long idLicence, Long idTeam) {
        this.idCustomer = idCustomer;
        this.idCompany = idCompany;
        this.idLicence = idLicence;
        this.idTeam = idTeam;
    }
*/
/*
    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }


    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }


    public Long getIdLicence() {
        return idLicence;
    }

    public void setIdLicence(Long idLicence) {
        this.idLicence = idLicence;
    }


    public Long getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Long idTeam) {
        this.idTeam = idTeam;
    }
*/
}

