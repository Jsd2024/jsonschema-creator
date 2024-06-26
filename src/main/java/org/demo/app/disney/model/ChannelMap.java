package org.demo.app.disney.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.List;
@Document(collection = "ChannelMap")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ChannelMap {

    @Id
    private String channelMapCode;
    private String channelMapName;
    private String marketCode;
    private String distributionChannelCode;
    private Timestamp createdOn;
    private String createdBy;
    private Timestamp updatedOn;
    private String updatedBy;

    @OneToMany
    private List<ProductChannel> productChannelList;

    @ManyToOne
    private Market market;

    @ManyToOne
    private DistributionChannel distributionChannel;




}
