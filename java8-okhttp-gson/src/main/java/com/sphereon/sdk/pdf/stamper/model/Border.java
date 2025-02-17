/*
 * PDF stamper
 * The PDF Stamper API enables the possibility to add both static and dynamic stamps on existing PDFs. The stamps can consist of one or more barcode, hyperlink, image, line or text elements.    The flow is generally as follows:  1. Make a configuration containing the stamp information  2. Create a job specifying the desired configuration  3. Add one or more PDF files to the job  4. Start the job for processing  5. Retrieve the processed files    Full API Documentation: https://docs.sphereon.com/api/pdf-stamper/1.0  Interactive testing: A web based test console is available in the Sphereon API Store at https://store.sphereon.com
 *
 * OpenAPI spec version: 1.0
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
import com.sphereon.sdk.pdf.stamper.model.Color;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Optional border of a component
 */
@ApiModel(description = "Optional border of a component")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-09T08:19:21.333Z")
public class Border {
  @SerializedName("color")
  private Color color = null;

  @SerializedName("thickness")
  private Float thickness = null;

  public Border color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * The color of the border
   * @return color
  **/
  @ApiModelProperty(required = true, value = "The color of the border")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public Border thickness(Float thickness) {
    this.thickness = thickness;
    return this;
  }

   /**
   * The thickness of the border line, which is 1 by default
   * @return thickness
  **/
  @ApiModelProperty(value = "The thickness of the border line, which is 1 by default")
  public Float getThickness() {
    return thickness;
  }

  public void setThickness(Float thickness) {
    this.thickness = thickness;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Border border = (Border) o;
    return Objects.equals(this.color, border.color) &&
        Objects.equals(this.thickness, border.thickness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, thickness);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Border {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    thickness: ").append(toIndentedString(thickness)).append("\n");
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

