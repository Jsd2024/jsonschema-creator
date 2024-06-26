package org.demo.app.disney.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Attribute")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Attribute {
    @Id
    private String id;
    private String code;
    private String name;
    private String type;
    private String value;
}
