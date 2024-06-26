package org.demo.app.disney.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Location")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Location {
    @Id
    private String  locationCode;
    private String locationName;

}
