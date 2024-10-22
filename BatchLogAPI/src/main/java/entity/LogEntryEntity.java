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
public class LogEntryEntity
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonDeserialize(using = CustomOffsetDateTimeDeserializer.class)
    private OffsetDateTime timeOfInvocation;

    private Integer recordNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payload_id", referencedColumnName = "id")
    private PayloadEntity actualPayload;

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("LogEntry \n");
        sb.append("{ \n");
        sb.append("    timeOfInvocation: ").append(toIndentedString(timeOfInvocation)).append("\n");
        sb.append("    recordNumber: ").append(toIndentedString(recordNumber)).append("\n");
        sb.append("    actualPayload: ").append(toIndentedString(actualPayload)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o)
    {
        if (o == null)
        {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
