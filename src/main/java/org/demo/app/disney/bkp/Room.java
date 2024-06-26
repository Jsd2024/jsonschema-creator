package org.demo.app.disney.bkp;

import jakarta.persistence.*;
import org.demo.app.disney.model.Product;

@Entity
public class Room extends Product {
//    @Id
    private String roomId;
    private int hotelCode;
    private String hotelName;
    private String rtCode;
    private String rtExtSystemCode;
    private String roomName;
    private int maxOccupancy;
    private int minOccupancy;
    private int standardOccupancy;

    private enum roomType{
        Standard,
        Executive,
        Suite,
        Premium
        };

}
