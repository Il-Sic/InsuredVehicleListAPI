package model;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
import lombok.Setter;
import utils.CustomOffsetDateTimeDeserializer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Payload {
    @Id
    private Integer id;

    private Integer idPol;
    private String cdescr;
    @JsonDeserialize(using = CustomOffsetDateTimeDeserializer.class)
    private OffsetDateTime dexpcur;
    private String cplate;
    private String cbrand;
    private String cmodel;
    private String cver;

    @Override
    public String toString() {
        return "Payload{" +
                "idPol=" + idPol +
                ", cdescr='" + cdescr + '\'' +
                ", dexpcur=" + dexpcur +
                ", cplate='" + cplate + '\'' +
                ", cbrand='" + cbrand + '\'' +
                ", cmodel='" + cmodel + '\'' +
                ", cver='" + cver + '\'' +
                '}';
    }
}