package org.demo.app.disney.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.sql.Timestamp;


@Document(collection = "ProductSetProduct")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ProductSet {
    @Id
    private String productSetCode;
    private String productSetName;
    private Timestamp createdOn;
    private String createdBy;
    private Timestamp updatedOn;
    private String updatedBy;

    private List<org.demo.app.disney.model.ClientConfig> productSetClientAttributes;
}

