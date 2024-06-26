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
import java.util.*;
@Document(collection = "BundleCategory")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class BundleCategory {
    @Id
    private String bundleCategoryId;
    private String productTemplateCode;
    private String classificationCode;
    private boolean isOptional;
    private boolean isSelectable;
    private int maxSelection;
    private Timestamp createdOn;
    private String createdBy;
    private Timestamp updatedOn;
    private String updatedBy;
    @ManyToOne
    private ProductTemplate productTemplate;

    @OneToMany
    private List<TemplateBundleComponent> templateBundleComponents;
    @OneToMany
    private List<ProductBundleComponent> productBundleComponents;
}
