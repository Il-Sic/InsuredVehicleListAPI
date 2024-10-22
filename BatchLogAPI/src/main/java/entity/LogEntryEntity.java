package entity;

import lombok.Getter;
import lombok.Setter;

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

    private OffsetDateTime timeOfInvocation;

    private Integer recordNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payload_id", referencedColumnName = "id")
    private PayloadEntity actualPayload;
}
