package model;

import java.time.OffsetDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class LogEntry  {

  @Id
  private Integer id;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
  private OffsetDateTime timeOfInvocation;
  private Integer recordNumber;

  @ManyToOne
  @JoinColumn(name = "actual_payload_id")
  private Payload actualPayload;
}
