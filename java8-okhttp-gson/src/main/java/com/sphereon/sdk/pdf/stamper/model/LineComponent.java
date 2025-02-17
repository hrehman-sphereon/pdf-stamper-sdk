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
import com.sphereon.sdk.pdf.stamper.model.Border;
import com.sphereon.sdk.pdf.stamper.model.Color;
import com.sphereon.sdk.pdf.stamper.model.Connector;
import com.sphereon.sdk.pdf.stamper.model.Point;
import com.sphereon.sdk.pdf.stamper.model.StampComponent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * A line component to stamp a line on a pdf
 */
@ApiModel(description = "A line component to stamp a line on a pdf")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-09T08:19:21.333Z")
public class LineComponent extends StampComponent {
  @SerializedName("color")
  private Color color = null;

  @SerializedName("lineTo")
  private Point lineTo = null;

  @SerializedName("lineWidth")
  private Float lineWidth = null;

  public LineComponent color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * The color of the line
   * @return color
  **/
  @ApiModelProperty(value = "The color of the line")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public LineComponent lineTo(Point lineTo) {
    this.lineTo = lineTo;
    return this;
  }

   /**
   * The point to which the line should be drawn. The origin is derived of the X and Y coordinate of the component itself (bottom-left) 
   * @return lineTo
  **/
  @ApiModelProperty(required = true, value = "The point to which the line should be drawn. The origin is derived of the X and Y coordinate of the component itself (bottom-left) ")
  public Point getLineTo() {
    return lineTo;
  }

  public void setLineTo(Point lineTo) {
    this.lineTo = lineTo;
  }

  public LineComponent lineWidth(Float lineWidth) {
    this.lineWidth = lineWidth;
    return this;
  }

   /**
   * The thickness of the line
   * @return lineWidth
  **/
  @ApiModelProperty(value = "The thickness of the line")
  public Float getLineWidth() {
    return lineWidth;
  }

  public void setLineWidth(Float lineWidth) {
    this.lineWidth = lineWidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineComponent lineComponent = (LineComponent) o;
    return Objects.equals(this.color, lineComponent.color) &&
        Objects.equals(this.lineTo, lineComponent.lineTo) &&
        Objects.equals(this.lineWidth, lineComponent.lineWidth) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, lineTo, lineWidth, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineComponent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    lineTo: ").append(toIndentedString(lineTo)).append("\n");
    sb.append("    lineWidth: ").append(toIndentedString(lineWidth)).append("\n");
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

