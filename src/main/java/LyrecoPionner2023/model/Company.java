package LyrecoPionner2023.model;

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
@Table(name = "COMPANY")

public class Company implements Serializable {

    /**

     Identifiant de serialisation*/
    private static final long serialVersionUID = 1814504864568721993L;

    @Id
    @GeneratedValue(generator = "SEQ_COMPANY_ID", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String company_name;
    private int siret;
    private int siren;
    private int vat;
    private boolean rgpd;

    public void setId(Long id) {
    }

    /*@ManyToOne
    private Credential credential; */


}
