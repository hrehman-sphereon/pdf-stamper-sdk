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
import com.sphereon.sdk.pdf.stamper.model.Dimension;
import com.sphereon.sdk.pdf.stamper.model.Point;
import com.sphereon.sdk.pdf.stamper.model.StampComponent;
import com.sphereon.sdk.pdf.stamper.model.StreamLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * An image component to stamp an image on a pdf. Supported types are: BMP, GIF, PNG, JPG. You can use a &lt;&lt;StreamLocation&gt;&gt; or base64 string as input for the image. Optionally you can cale the image before it is stamped to a desired size.
 */
@ApiModel(description = "An image component to stamp an image on a pdf. Supported types are: BMP, GIF, PNG, JPG. You can use a <<StreamLocation>> or base64 string as input for the image. Optionally you can cale the image before it is stamped to a desired size. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-09T08:19:21.333Z")
public class ImageComponent extends StampComponent {
  @SerializedName("imageData")
  private String imageData = null;

  @SerializedName("scaledDimension")
  private Dimension scaledDimension = null;

  @SerializedName("imageStreamLocation")
  private StreamLocation imageStreamLocation = null;

  public ImageComponent() {
    super(StampType.IMAGECOMPONENT.name());
  }

  public ImageComponent imageData(String imageData) {
    this.imageData = imageData;
    return this;
  }

   /**
   * The image as a base64 string if a stream location is not being used
   * @return imageData
  **/
  @ApiModelProperty(value = "The image as a base64 string if a stream location is not being used")
  public String getImageData() {
    return imageData;
  }

  public void setImageData(String imageData) {
    this.imageData = imageData;
  }

  public ImageComponent scaledDimension(Dimension scaledDimension) {
    this.scaledDimension = scaledDimension;
    return this;
  }

   /**
   * The preferred dimension of the image
   * @return scaledDimension
  **/
  @ApiModelProperty(value = "The preferred dimension of the image")
  public Dimension getScaledDimension() {
    return scaledDimension;
  }

  public void setScaledDimension(Dimension scaledDimension) {
    this.scaledDimension = scaledDimension;
  }

  public ImageComponent imageStreamLocation(StreamLocation imageStreamLocation) {
    this.imageStreamLocation = imageStreamLocation;
    return this;
  }

   /**
   * The stream location of the image. This is used if image data hasn&#39;t been set
   * @return imageStreamLocation
  **/
  @ApiModelProperty(value = "The stream location of the image. This is used if image data hasn't been set")
  public StreamLocation getImageStreamLocation() {
    return imageStreamLocation;
  }

  public void setImageStreamLocation(StreamLocation imageStreamLocation) {
    this.imageStreamLocation = imageStreamLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageComponent imageComponent = (ImageComponent) o;
    return Objects.equals(this.imageData, imageComponent.imageData) &&
        Objects.equals(this.scaledDimension, imageComponent.scaledDimension) &&
        Objects.equals(this.imageStreamLocation, imageComponent.imageStreamLocation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageData, scaledDimension, imageStreamLocation, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageComponent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    scaledDimension: ").append(toIndentedString(scaledDimension)).append("\n");
    sb.append("    imageStreamLocation: ").append(toIndentedString(imageStreamLocation)).append("\n");
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

  @Override
  public void validate() {
    // TODO implement
  }

}

