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
import com.sphereon.sdk.pdf.stamper.model.Connector;
import com.sphereon.sdk.pdf.stamper.model.Point;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * StampComponent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-09T08:19:21.333Z")

public class StampComponent {
  @SerializedName("border")
  private Border border = null;

  @SerializedName("connectors")
  private List<Connector> connectors = null;

  @SerializedName("offset")
  private Point offset = null;

  public StampComponent border(Border border) {
    this.border = border;
    return this;
  }

   /**
   * The border of the component
   * @return border
  **/
  @ApiModelProperty(value = "The border of the component")
  public Border getBorder() {
    return border;
  }

  public void setBorder(Border border) {
    this.border = border;
  }

  public StampComponent connectors(List<Connector> connectors) {
    this.connectors = connectors;
    return this;
  }

  public StampComponent addConnectorsItem(Connector connectorsItem) {
    if (this.connectors == null) {
      this.connectors = new ArrayList<>();
    }
    this.connectors.add(connectorsItem);
    return this;
  }

   /**
   * Connectors containing components that can be positioned relative to this component
   * @return connectors
  **/
  @ApiModelProperty(value = "Connectors containing components that can be positioned relative to this component")
  public List<Connector> getConnectors() {
    return connectors;
  }

  public void setConnectors(List<Connector> connectors) {
    this.connectors = connectors;
  }

  public StampComponent offset(Point offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The offset of the component relative to the parent component
   * @return offset
  **/
  @ApiModelProperty(value = "The offset of the component relative to the parent component")
  public Point getOffset() {
    return offset;
  }

  public void setOffset(Point offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StampComponent stampComponent = (StampComponent) o;
    return Objects.equals(this.border, stampComponent.border) &&
        Objects.equals(this.connectors, stampComponent.connectors) &&
        Objects.equals(this.offset, stampComponent.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(border, connectors, offset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StampComponent {\n");
    
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
    sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

