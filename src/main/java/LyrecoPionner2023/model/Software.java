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
@Table(name = "Software")

public class Software implements Serializable {

    /**

     Identifiant de serialisation*/
    private static final long serialVersionUID = 1814504864568721993L;

    @Id
    @GeneratedValue(generator = "SEQ_Software_ID", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String logo;
    private String description;
    private String label;
    private String releaseDate;
    private Long userType;
    private String firstDetail;
    private String secondDetail;
    private String screenOne;
    private String screentwo;
    private int idPrice;
    private int idLangage;

}
