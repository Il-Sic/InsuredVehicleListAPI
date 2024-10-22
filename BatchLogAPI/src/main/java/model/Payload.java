package model;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

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
  private OffsetDateTime dexpcur;
  private String cplate;
  private String cbrand;
  private String cmodel;
  private String cver;

  public void updateFields(Payload updatedPayload) {
    this.idPol = updatedPayload.getIdPol();
    this.cdescr = updatedPayload.getCdescr();
    this.dexpcur = updatedPayload.getDexpcur();
    this.cplate = updatedPayload.getCplate();
    this.cbrand = updatedPayload.getCbrand();
    this.cmodel = updatedPayload.getCmodel();
    this.cver = updatedPayload.getCver();
  }

  @Override
  public String toString() {
    return "Payload{" +
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