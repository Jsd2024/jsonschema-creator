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
import java.util.*;
@Document(collection = "ProductTemplateLocation")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ProductTemplateLocation {
    @Id
    private String productTemplateLocationId;
    private String productTemplateCode;
    private String locationCode;
    private Timestamp createdOn;
    private String createdBy;
    private Timestamp updatedOn;
    private String updatedBy;
    @ManyToOne
    private ProductTemplate productTemplate;

}
