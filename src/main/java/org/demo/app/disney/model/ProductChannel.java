package org.demo.app.disney.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.List;

@Document(collection = "ProductChannel")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ProductChannel {
    @Id
    private String productChannelId;
    private String productCode;
    private String channelMapCode;
    private String channelMapName;
    private DistributionChannel distributionChannel;
    private Market market;
    private Timestamp createdOn;
    private String createdBy;
    private Timestamp updatedOn;
    private String updatedBy;
    private List<org.demo.app.disney.model.ClientConfig> channelClientAttributes;
    @ManyToOne
    Product product;
    @ManyToOne
    ChannelMap channelMap;


}
