package LyrecoPionner2023.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "CUSTOMERORDER")
public class Order implements Serializable {


    private static final long serialVersionUID = 1234504864568721993L;

    @Id
    @GeneratedValue(generator = "SEQ_ORDER_ID", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String status;
    private Date date;


    /*@ManyToOne
    private Credential credential; */


}
