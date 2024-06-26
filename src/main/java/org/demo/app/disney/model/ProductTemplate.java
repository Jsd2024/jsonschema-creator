package org.demo.app.disney.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Document(collection = "ProductTemplate")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ProductTemplate{
    @Id
    private String productTemplateCode;
    private String productTemplateName;
    private String classificationCode;
    private String statusCode;
    private boolean inactive;
    private List<ProductTemplateDuration> productTemplateDurations;
    private List<Age> ages;
    private Classification classification;
    private List<Classification> productTemplateClassifications;
    private List<Attribute> attributes;
    private List<ClientConfig> templateClientAttributes;
    private List<Location> locationRestrictions;
    private Timestamp created_on;
    private String created_by;
    private Timestamp updated_on;
    private String updated_by;
    @OneToMany
    private List<Product> productList;
    @OneToMany
    private List<ProductTemplateLocation> productTemplateLocationList;
    @OneToMany
    private List<ProductTemplateAttribute> productTemplateAttributeList;
    @OneToMany
    private List<ProductTemplateDuration> productTemplateDurationList;
    @OneToMany
    private List<ProductTemplateAge> productTemplateAgeList;
    @OneToMany
    private List<BundleCategory> bundleCategoryList;
    @OneToMany
    private List<TemplateBundleComponent> templateBundleComponentList;
}
