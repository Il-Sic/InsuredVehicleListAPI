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
public class PayloadEntity
{
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
        StringBuilder sb = new StringBuilder();
        sb.append("Payload \n");
        sb.append("{ \n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idPol: ").append(toIndentedString(idPol)).append("\n");
        sb.append("    cdescr: ").append(toIndentedString(cdescr)).append("\n");
        sb.append("    dexpcur: ").append(toIndentedString(dexpcur)).append("\n");
        sb.append("    cplate: ").append(toIndentedString(cplate)).append("\n");
        sb.append("    cbrand: ").append(toIndentedString(cbrand)).append("\n");
        sb.append("    cmodel: ").append(toIndentedString(cmodel)).append("\n");
        sb.append("    cver: ").append(toIndentedString(cver)).append("\n");
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

