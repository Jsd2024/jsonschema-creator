package org.demo.app.disney.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.security.SecureRandom;

@Document(collection = "Classification")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Classification {
    @Id
    private String classificationCode;
    private String  classificationName;
    private String level;
    private String parentClassificationCode;
    private Classification parentClassification;
}
