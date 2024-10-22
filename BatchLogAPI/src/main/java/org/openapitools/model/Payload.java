package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Payload
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-22T10:25:13.637745700+02:00[Europe/Rome]", comments = "Generator version: 7.7.0")
public class Payload extends model.Payload
{

  private Integer id;

  private Integer idPol;

  private String cdescr;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dexpcur;

  private String cplate;

  private String cbrand;

  private String cmodel;

  private String cver;

  public Payload id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Payload idPol(Integer idPol) {
    this.idPol = idPol;
    return this;
  }

  /**
   * Get idPol
   * @return idPol
   */
  
  @Schema(name = "idPol", example = "123", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idPol")
  public Integer getIdPol() {
    return idPol;
  }

  public void setIdPol(Integer idPol) {
    this.idPol = idPol;
  }

  public Payload cdescr(String cdescr) {
    this.cdescr = cdescr;
    return this;
  }

  /**
   * Get cdescr
   * @return cdescr
   */
  
  @Schema(name = "cdescr", example = "Description of the payload", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cdescr")
  public String getCdescr() {
    return cdescr;
  }

  public void setCdescr(String cdescr) {
    this.cdescr = cdescr;
  }

  public Payload dexpcur(OffsetDateTime dexpcur) {
    this.dexpcur = dexpcur;
    return this;
  }

  /**
   * Get dexpcur
   * @return dexpcur
   */
  @Valid 
  @Schema(name = "dexpcur", example = "2024-10-16T08:30Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dexpcur")
  public OffsetDateTime getDexpcur() {
    return dexpcur;
  }

  public void setDexpcur(OffsetDateTime dexpcur) {
    this.dexpcur = dexpcur;
  }

  public Payload cplate(String cplate) {
    this.cplate = cplate;
    return this;
  }

  /**
   * Get cplate
   * @return cplate
   */
  
  @Schema(name = "cplate", example = "ABC123", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cplate")
  public String getCplate() {
    return cplate;
  }

  public void setCplate(String cplate) {
    this.cplate = cplate;
  }

  public Payload cbrand(String cbrand) {
    this.cbrand = cbrand;
    return this;
  }

  /**
   * Get cbrand
   * @return cbrand
   */
  
  @Schema(name = "cbrand", example = "BrandName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cbrand")
  public String getCbrand() {
    return cbrand;
  }

  public void setCbrand(String cbrand) {
    this.cbrand = cbrand;
  }

  public Payload cmodel(String cmodel) {
    this.cmodel = cmodel;
    return this;
  }

  /**
   * Get cmodel
   * @return cmodel
   */
  
  @Schema(name = "cmodel", example = "ModelName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmodel")
  public String getCmodel() {
    return cmodel;
  }

  public void setCmodel(String cmodel) {
    this.cmodel = cmodel;
  }

  public Payload cver(String cver) {
    this.cver = cver;
    return this;
  }

  /**
   * Get cver
   * @return cver
   */
  
  @Schema(name = "cver", example = "1.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cver")
  public String getCver() {
    return cver;
  }

  public void setCver(String cver) {
    this.cver = cver;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payload payload = (Payload) o;
    return Objects.equals(this.id, payload.id) &&
        Objects.equals(this.idPol, payload.idPol) &&
        Objects.equals(this.cdescr, payload.cdescr) &&
        Objects.equals(this.dexpcur, payload.dexpcur) &&
        Objects.equals(this.cplate, payload.cplate) &&
        Objects.equals(this.cbrand, payload.cbrand) &&
        Objects.equals(this.cmodel, payload.cmodel) &&
        Objects.equals(this.cver, payload.cver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idPol, cdescr, dexpcur, cplate, cbrand, cmodel, cver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payload {\n");
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

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

