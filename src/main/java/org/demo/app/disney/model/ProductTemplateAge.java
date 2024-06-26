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

@Document(collection = "ProductTemplateAge")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ProductTemplateAge {
    @Id
    private String productAgeId;
    private String productTemplateCode;
    private String ageCode;
    private Timestamp createdOn;
    private String createdBy;
    private Timestamp updatedOn;
    private String updatedBy;
    @ManyToOne
    private ProductTemplate productTemplate;
}
