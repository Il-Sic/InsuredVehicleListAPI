package entity;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payload {

    private Integer id;

    private Integer idPol;
    private String cdescr;
    private Date dexpcur;
    private String cplate;
    private String cbrand;
    private String cmodel;
    private String cver;
}
