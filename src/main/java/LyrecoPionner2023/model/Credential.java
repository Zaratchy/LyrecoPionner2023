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
@Table(name = "CREDENTIAL")

public class Credential {

    /**

     Identifiant de serialisation*/
    private static final long serialVersionUID = 1814504864568721993L;

    @Id
    @GeneratedValue(generator = "SEQ_CREDENTIAL_ID", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String password;

    /*@ManyToOne
    private Credential credential; */

}
