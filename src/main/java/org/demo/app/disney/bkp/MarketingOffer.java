package org.demo.app.disney.bkp;

import lombok.*;
import org.demo.app.disney.model.Product;
import org.springframework.data.mongodb.core.mapping.*;

import java.util.*;

@Document(collection = "marketingOffer")
@Data
//@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class MarketingOffer extends Product {
    //    @Id
    private String marketingOfferId;
    private List<Room> roomBundle;
    private List<Ticket> ticketBundle;
    private List<Dine> dineBundle;
    private List<Miscellaneous> miscBundle;


}
