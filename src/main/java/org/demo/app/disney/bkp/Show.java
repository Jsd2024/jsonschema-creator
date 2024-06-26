package org.demo.app.disney.bkp;

import jakarta.persistence.*;


@Entity
public class Show  extends Miscellaneous {
//    @Id
    private String showId;
    private enum showType{
        addOn,
        standAlone
    };
}
