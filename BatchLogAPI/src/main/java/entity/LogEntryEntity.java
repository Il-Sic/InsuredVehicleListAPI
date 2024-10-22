package entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;
import utils.CustomOffsetDateTimeDeserializer;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "log_entry")
public class LogEntryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonDeserialize(using = CustomOffsetDateTimeDeserializer.class)
    private OffsetDateTime timeOfInvocation;

    private Integer recordNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payload_id", referencedColumnName = "id")
    private PayloadEntity actualPayload;

}
