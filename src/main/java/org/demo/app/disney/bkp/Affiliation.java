package org.demo.app.disney.bkp;

import jakarta.persistence.*;

//@Entity
public class Affiliation extends MarketingOffer {
    @Id
    private String memberShipProgId;


    private enum memberShipProgNm {
        CastMember,
        Club33,
        CorporateAlliance,
        DomesticHispanic,
        FriendsAndFamily,
        Military,
        Passholder

    }

    ;


}
