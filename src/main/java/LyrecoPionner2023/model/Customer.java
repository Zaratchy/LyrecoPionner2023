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
@Table(name = "CUSTOMER")

public class Customer implements Serializable {

    /**

     Identifiant de serialisation*/
    private static final long serialVersionUID = 1814504864568721993L;

    @Id
    @GeneratedValue(generator = "SEQ_CUSTOMER_ID", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String civility;
    private String password;

    @ManyToOne
    private Role role;

}

