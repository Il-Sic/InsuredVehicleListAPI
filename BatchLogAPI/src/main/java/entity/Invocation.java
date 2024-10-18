package entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import dto.PayloadDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Invocation {
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime timeOfInvocation;
    private Integer recordNumber;

    private PayloadDto actualPayload;
}
