package org.wso2.apk.apimgt.rest.api.publisher.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

public class CertificateValidityDTO   {
  
    private String from = null;
    private String to = null;

  /**
   **/
  public CertificateValidityDTO from(String from) {
    this.from = from;
    return this;
  }

  
  @ApiModelProperty(example = "12-12-2017", value = "")
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }
  public void setFrom(String from) {
    this.from = from;
  }

  /**
   **/
  public CertificateValidityDTO to(String to) {
    this.to = to;
    return this;
  }

  
  @ApiModelProperty(example = "01-01-2019", value = "")
  @JsonProperty("to")
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateValidityDTO certificateValidity = (CertificateValidityDTO) o;
    return Objects.equals(from, certificateValidity.from) &&
        Objects.equals(to, certificateValidity.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateValidityDTO {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

