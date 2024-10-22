package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "payload")
public class PayloadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer idPol;

    private String cdescr;

    private OffsetDateTime dexpcur;

    private String cplate;

    private String cbrand;

    private String cmodel;

    private String cver;
}

