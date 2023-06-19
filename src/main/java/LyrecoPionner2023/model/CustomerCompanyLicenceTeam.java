package LyrecoPionner2023.model;


import LyrecoPionner2023.model.pk.CustomerCompanyLicenceTeamPk;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CUSTOMERCOMPANYLICENCETEAM")
public class CustomerCompanyLicenceTeam implements Serializable {


    /**
     * Identifiant de serialisation
     */
    private static final long serialVersionUID = -3719338644021026319L;

    @EmbeddedId
    private CustomerCompanyLicenceTeamPk id = new CustomerCompanyLicenceTeamPk() ;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idCustomer")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idCompany")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idLicence")
    private Licence licence;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idTeam")
    private Team team;


    public CustomerCompanyLicenceTeam( Customer customer, Company company, Licence licence, Team team ) {
        CustomerCompanyLicenceTeamPk id =new CustomerCompanyLicenceTeamPk(customer.getId(),company.getId(),licence.getId(),team.getId());
        this.id=id;
        this.customer=customer;
        this.company=company;
        this.licence=licence;
        this.team =team;
    }

    public CustomerCompanyLicenceTeam() {
    }


    public CustomerCompanyLicenceTeamPk getId() {
        return id;
    }

    public void setId(CustomerCompanyLicenceTeamPk id) {
        this.id = id;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company prestation) {
        this.company = company;
    }


    public Licence getLicence() {
        return licence;
    }

    public void setLicence(Licence licence) {
        this.licence = licence;
    }


    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}


