package entity;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Payload
{
    @Id
    private Integer id;

    private Integer idPol;
    private String cdescr;
    private Date dexpcur;
    private String cplate;
    private String cbrand;
    private String cmodel;
    private String cver;
}
