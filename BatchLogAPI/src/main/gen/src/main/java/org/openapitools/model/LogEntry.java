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
 * LogEntry
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-17T12:31:52.704978500+02:00[Europe/Rome]", comments = "Generator version: 7.7.0")
public class LogEntry {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timeOfInvocation;

  private Integer recordNumber;

  private String actualPayload;

  public LogEntry timeOfInvocation(OffsetDateTime timeOfInvocation) {
    this.timeOfInvocation = timeOfInvocation;
    return this;
  }

  /**
   * Get timeOfInvocation
   * @return timeOfInvocation
   */
  @Valid 
  @Schema(name = "timeOfInvocation", example = "2024-10-16T08:30Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeOfInvocation")
  public OffsetDateTime getTimeOfInvocation() {
    return timeOfInvocation;
  }

  public void setTimeOfInvocation(OffsetDateTime timeOfInvocation) {
    this.timeOfInvocation = timeOfInvocation;
  }

  public LogEntry recordNumber(Integer recordNumber) {
    this.recordNumber = recordNumber;
    return this;
  }

  /**
   * Get recordNumber
   * @return recordNumber
   */
  
  @Schema(name = "recordNumber", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recordNumber")
  public Integer getRecordNumber() {
    return recordNumber;
  }

  public void setRecordNumber(Integer recordNumber) {
    this.recordNumber = recordNumber;
  }

  public LogEntry actualPayload(String actualPayload) {
    this.actualPayload = actualPayload;
    return this;
  }

  /**
   * Get actualPayload
   * @return actualPayload
   */
  
  @Schema(name = "actualPayload", example = "Payload string content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actualPayload")
  public String getActualPayload() {
    return actualPayload;
  }

  public void setActualPayload(String actualPayload) {
    this.actualPayload = actualPayload;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogEntry logEntry = (LogEntry) o;
    return Objects.equals(this.timeOfInvocation, logEntry.timeOfInvocation) &&
        Objects.equals(this.recordNumber, logEntry.recordNumber) &&
        Objects.equals(this.actualPayload, logEntry.actualPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOfInvocation, recordNumber, actualPayload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogEntry {\n");
    sb.append("    timeOfInvocation: ").append(toIndentedString(timeOfInvocation)).append("\n");
    sb.append("    recordNumber: ").append(toIndentedString(recordNumber)).append("\n");
    sb.append("    actualPayload: ").append(toIndentedString(actualPayload)).append("\n");
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

