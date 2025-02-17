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
import com.sphereon.sdk.pdf.stamper.model.BlockchainConfig;
import com.sphereon.sdk.pdf.stamper.model.CanvasComponent;
import com.sphereon.sdk.pdf.stamper.model.DefaultJobSettings;
import com.sphereon.sdk.pdf.stamper.model.StorageLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The PDF stamper configuration
 */
@ApiModel(description = "The PDF stamper configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-09T08:19:21.333Z")
public class StamperConfig {
  @SerializedName("blockchainConfig")
  private BlockchainConfig blockchainConfig = null;

  @SerializedName("defaultJobSettings")
  private DefaultJobSettings defaultJobSettings = null;

  @SerializedName("configResourcesLocation")
  private StorageLocation configResourcesLocation = null;

  @SerializedName("canvasComponents")
  private List<CanvasComponent> canvasComponents = new ArrayList<>();

  public StamperConfig blockchainConfig(BlockchainConfig blockchainConfig) {
    this.blockchainConfig = blockchainConfig;
    return this;
  }

   /**
   * Optional blockchain proof configuration. This is applicable to all stamps created using this configuration. 
   * @return blockchainConfig
  **/
  @ApiModelProperty(value = "Optional blockchain proof configuration. This is applicable to all stamps created using this configuration. ")
  public BlockchainConfig getBlockchainConfig() {
    return blockchainConfig;
  }

  public void setBlockchainConfig(BlockchainConfig blockchainConfig) {
    this.blockchainConfig = blockchainConfig;
  }

  public StamperConfig defaultJobSettings(DefaultJobSettings defaultJobSettings) {
    this.defaultJobSettings = defaultJobSettings;
    return this;
  }

   /**
   * Default job settings. Values omitted from the job will get default settings specified in here
   * @return defaultJobSettings
  **/
  @ApiModelProperty(value = "Default job settings. Values omitted from the job will get default settings specified in here")
  public DefaultJobSettings getDefaultJobSettings() {
    return defaultJobSettings;
  }

  public void setDefaultJobSettings(DefaultJobSettings defaultJobSettings) {
    this.defaultJobSettings = defaultJobSettings;
  }

  public StamperConfig configResourcesLocation(StorageLocation configResourcesLocation) {
    this.configResourcesLocation = configResourcesLocation;
    return this;
  }

   /**
   * The storage location where the configuration resources will be stored
   * @return configResourcesLocation
  **/
  @ApiModelProperty(value = "The storage location where the configuration resources will be stored")
  public StorageLocation getConfigResourcesLocation() {
    return configResourcesLocation;
  }

  public void setConfigResourcesLocation(StorageLocation configResourcesLocation) {
    this.configResourcesLocation = configResourcesLocation;
  }

  public StamperConfig canvasComponents(List<CanvasComponent> canvasComponents) {
    this.canvasComponents = canvasComponents;
    return this;
  }

  public StamperConfig addCanvasComponentsItem(CanvasComponent canvasComponentsItem) {
    this.canvasComponents.add(canvasComponentsItem);
    return this;
  }

   /**
   * The canvas components containing the information of the stamp
   * @return canvasComponents
  **/
  @ApiModelProperty(required = true, value = "The canvas components containing the information of the stamp")
  public List<CanvasComponent> getCanvasComponents() {
    return canvasComponents;
  }

  public void setCanvasComponents(List<CanvasComponent> canvasComponents) {
    this.canvasComponents = canvasComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StamperConfig stamperConfig = (StamperConfig) o;
    return Objects.equals(this.blockchainConfig, stamperConfig.blockchainConfig) &&
        Objects.equals(this.defaultJobSettings, stamperConfig.defaultJobSettings) &&
        Objects.equals(this.configResourcesLocation, stamperConfig.configResourcesLocation) &&
        Objects.equals(this.canvasComponents, stamperConfig.canvasComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchainConfig, defaultJobSettings, configResourcesLocation, canvasComponents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StamperConfig {\n");
    
    sb.append("    blockchainConfig: ").append(toIndentedString(blockchainConfig)).append("\n");
    sb.append("    defaultJobSettings: ").append(toIndentedString(defaultJobSettings)).append("\n");
    sb.append("    configResourcesLocation: ").append(toIndentedString(configResourcesLocation)).append("\n");
    sb.append("    canvasComponents: ").append(toIndentedString(canvasComponents)).append("\n");
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

