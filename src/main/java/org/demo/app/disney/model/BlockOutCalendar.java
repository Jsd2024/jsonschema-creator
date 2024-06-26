package org.demo.app.disney.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.util.List;


@Document(collection = "BlockOutCalendar")
@Entity
@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class BlockOutCalendar {
    @Id
    private String blockOutCalendarCode;
    private String blockOutCalendarName;
    private boolean inactive;
    private Timestamp createdOn;
    private String createdBy;
    private Timestamp updatedOn;
    private String updatedBy;
    @OneToMany
    private List<BlockOutCalendarDate> blockOutCalendarDates;
}
