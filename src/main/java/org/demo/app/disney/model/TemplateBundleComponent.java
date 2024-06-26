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
@Document(collection = "TemplateBundleComponent")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class TemplateBundleComponent {
    @Id
    private String templateBundleComponentId;
    private String bundleCategoryId;
    private String productTemplateCode;
    private String componentProductTemplateCode;
    private Timestamp createdOn;
    private String createdBy;
    private Timestamp updatedOn;
    private String updatedBy;
    @ManyToOne
    private ProductTemplate productTemplate;
    @ManyToOne
    private BundleCategory bundleCategory;

}
