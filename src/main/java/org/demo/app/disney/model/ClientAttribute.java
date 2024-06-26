package org.demo.app.disney.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ClientAttribute")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ClientAttribute {
    @Id
    private String clientCode;
    private String  id;
    private String code;
    private String name;
    private String type;
    private String value;
    private String level;
    private String levelCode;
}
