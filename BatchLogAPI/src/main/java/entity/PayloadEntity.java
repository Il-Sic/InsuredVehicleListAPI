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
@Table(name = "payload")
public class PayloadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer idPol;

    private String cdescr;

    @JsonDeserialize(using = CustomOffsetDateTimeDeserializer.class)
    private OffsetDateTime dexpcur;

    private String cplate;

    private String cbrand;

    private String cmodel;

    private String cver;

    @Override
    public String toString()
    {
        return "PayloadEntity{" +
                "id=" + id +
                ", idPol=" + idPol +
                ", cdescr='" + cdescr + '\'' +
                ", dexpcur=" + dexpcur +
                ", cplate='" + cplate + '\'' +
                ", cbrand='" + cbrand + '\'' +
                ", cmodel='" + cmodel + '\'' +
                ", cver='" + cver + '\'' +
                '}';
    }
}

