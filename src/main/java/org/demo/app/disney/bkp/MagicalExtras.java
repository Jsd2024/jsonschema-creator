package org.demo.app.disney.bkp;


import jakarta.persistence.*;

@Entity
public class MagicalExtras extends Miscellaneous {

//    @Id
    private String magicalExtrasId;

    private enum merchandiseProductType {
        Lanyards,
        PlushToys,
        Pins,
        MBC,
        Amenity,
        GiftCards,
        DisneyRewardsCoolerBag

    }

    ;
}
