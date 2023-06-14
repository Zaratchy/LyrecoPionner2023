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
@Table(name = "LICENCE")

public class Licence implements Serializable {

    /**

     Identifiant de serialisation*/
    private static final long serialVersionUID = 1814504864568721993L;

    @Id
    @GeneratedValue(generator = "SEQ_LICENCE_ID", strategy = GenerationType.SEQUENCE)
    private Long id;
    private int duration;
    private int number;

    /*@ManyToOne
    private Credential credential; */

}
