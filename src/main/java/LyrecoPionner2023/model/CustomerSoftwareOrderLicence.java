package LyrecoPionner2023.model;

import LyrecoPionner2023.model.pk.CustomerSoftwareOrderLicencePk;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "CUSTOMERSOFTWAREORDERLICENCE")
public class CustomerSoftwareOrderLicence implements Serializable{


    /**
     * Identifiant de serialisation
     */
    private static final long serialVersionUID = -3719338644021026319L;

    @EmbeddedId
    private CustomerSoftwareOrderLicencePk id = new CustomerSoftwareOrderLicencePk() ;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idCustomer")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idSoftware")
    private Software software;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idOrder")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idLicence")
    private Licence licence;


    public CustomerSoftwareOrderLicence( Customer customer, Software software, Order order, Licence licence ) {
        CustomerSoftwareOrderLicencePk id =new CustomerSoftwareOrderLicencePk(customer.getId(),software.getId(),order.getId(),licence.getId());
        this.id=id;
        this.customer=customer;
        this.software=software;
        this.order=order;
        this.licence =licence;
    }

    public CustomerSoftwareOrderLicencePk getId() {
        return id;
    }

    public void setId(CustomerSoftwareOrderLicencePk id) {
        this.id = id;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


    public Licence getLicence() {
        return licence;
    }

    public void setLicence(Licence licence) {
        this.licence = licence;
    }

}
