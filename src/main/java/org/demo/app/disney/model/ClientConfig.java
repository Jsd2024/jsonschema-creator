package org.demo.app.disney.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.demo.app.disney.model.Attribute;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "ClientConfig")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class ClientConfig {
    @Id
    private String clientCode;
    @OneToMany
    private List<ClientAttribute> clientAttributes;
    private List<String> attributeIDs;

}
