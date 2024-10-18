package dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class PayloadDto {

    private Integer idPol;
    private String cdescr;
    private Date dexpcur;
    private String cplate;
    private String cbrand;
    private String cmodel;
    private String cver;
}