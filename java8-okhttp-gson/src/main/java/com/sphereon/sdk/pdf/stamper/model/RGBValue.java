/*
 * PDF stamper
 * The PDF Stamper API enables the possibility to add both static and dynamic stamps on existing PDFs. The stamps can consist of one or more barcode, hyperlink, image, line or text elements.    The flow is generally as follows:  1. Make a configuration containing the stamp information  2. Create a job specifying the desired configuration  3. Add one or more PDF files to the job  4. Start the job for processing  5. Retrieve the processed files    Full API Documentation: https://docs.sphereon.com/api/pdf-stamper/0.2  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 0.2
 * Contact: dev@sphereon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sphereon.sdk.pdf.stamper.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A RGB color value
 */
@ApiModel(description = "A RGB color value")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-03T17:44:37.086+01:00")
public class RGBValue {
  @SerializedName("b")
  private Integer b = null;

  @SerializedName("r")
  private Integer r = null;

  @SerializedName("g")
  private Integer g = null;

  public RGBValue b(Integer b) {
    this.b = b;
    return this;
  }

   /**
   * Get b
   * @return b
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getB() {
    return b;
  }

  public void setB(Integer b) {
    this.b = b;
  }

  public RGBValue r(Integer r) {
    this.r = r;
    return this;
  }

   /**
   * Get r
   * @return r
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getR() {
    return r;
  }

  public void setR(Integer r) {
    this.r = r;
  }

  public RGBValue g(Integer g) {
    this.g = g;
    return this;
  }

   /**
   * Get g
   * @return g
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getG() {
    return g;
  }

  public void setG(Integer g) {
    this.g = g;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RGBValue rgBValue = (RGBValue) o;
    return Objects.equals(this.b, rgBValue.b) &&
        Objects.equals(this.r, rgBValue.r) &&
        Objects.equals(this.g, rgBValue.g);
  }

  @Override
  public int hashCode() {
    return Objects.hash(b, r, g);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RGBValue {\n");
    
    sb.append("    b: ").append(toIndentedString(b)).append("\n");
    sb.append("    r: ").append(toIndentedString(r)).append("\n");
    sb.append("    g: ").append(toIndentedString(g)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

