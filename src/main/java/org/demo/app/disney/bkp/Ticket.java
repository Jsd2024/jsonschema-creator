package org.demo.app.disney.bkp;

import jakarta.persistence.*;
import org.demo.app.disney.model.Product;

@Entity
public class Ticket extends Product {

//    @Id
    private String ticketId;

    private enum ticketType {
        PackageTickets,
        StandaloneTickets,
        AnnualPass,
        ResortTax,
        ParkTickets,
        SpecialEventParkTicket,
        PhotoPass,
        GiftCard

    }

    ;
}
