package org.demo.app.disney.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.*;
import java.util.*;
import java.sql.Timestamp;
@Document(collection = "Product")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Product {
    @Id
    private String productCode;
    private String productName;
    private String statusCode;
    private Date salesStartDate;
    private Date salesEndDate;
    private Date usageStartDate;
    private Date usageEndDate;
    private String blockOutCalendarCode;
    private BlockOutCalendar blockOutCalendar;
    private Timestamp createdOn;
    private String createdBy;
    private Timestamp updatedOn;
    private String updatedBy;
    private ProductTemplate productTemplate;
    @OneToMany
    private List<ProductBundleComponent> productBundleComponentList;
    @OneToMany
    private List<ProductSet> productSets;
    @OneToMany
    private List<ProductChannel> productChannels;
    @OneToMany
    private List<org.demo.app.disney.model.ClientConfig> productClientAttributes;
}
