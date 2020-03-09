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
import com.sphereon.sdk.pdf.stamper.model.StamperConfig;
import com.sphereon.sdk.pdf.stamper.model.StreamLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Response with the PDF stamper configuration
 */
@ApiModel(description = "Response with the PDF stamper configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-09T08:19:21.333Z")
public class StamperConfigResponse {
  @SerializedName("configResources")
  private List<StreamLocation> configResources = null;

  @SerializedName("creationTime")
  private OffsetDateTime creationTime = null;

  @SerializedName("configId")
  private String configId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("updateTime")
  private OffsetDateTime updateTime = null;

  /**
   * The status of the config action
   */
  @JsonAdapter(ConfigStatusEnum.Adapter.class)
  public enum ConfigStatusEnum {
    CREATED("CREATED"),
    
    UPDATED("UPDATED"),
    
    RESOURCE_UPLOADED("RESOURCE_UPLOADED"),
    
    ERROR("ERROR"),
    
    DELETED("DELETED"),
    
    DONE("DONE");

    private String value;

    ConfigStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConfigStatusEnum fromValue(String text) {
      for (ConfigStatusEnum b : ConfigStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConfigStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConfigStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConfigStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConfigStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("configStatus")
  private ConfigStatusEnum configStatus = null;

  @SerializedName("config")
  private StamperConfig config = null;

  @SerializedName("statusMessage")
  private String statusMessage = null;

  public StamperConfigResponse configResources(List<StreamLocation> configResources) {
    this.configResources = configResources;
    return this;
  }

  public StamperConfigResponse addConfigResourcesItem(StreamLocation configResourcesItem) {
    if (this.configResources == null) {
      this.configResources = new ArrayList<>();
    }
    this.configResources.add(configResourcesItem);
    return this;
  }

   /**
   * Any registered resource used by the configuration
   * @return configResources
  **/
  @ApiModelProperty(value = "Any registered resource used by the configuration")
  public List<StreamLocation> getConfigResources() {
    return configResources;
  }

  public void setConfigResources(List<StreamLocation> configResources) {
    this.configResources = configResources;
  }

   /**
   * The creation date/time of the initial configuration in ISO 8601 format
   * @return creationTime
  **/
  @ApiModelProperty(value = "The creation date/time of the initial configuration in ISO 8601 format")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

   /**
   * The configuration id
   * @return configId
  **/
  @ApiModelProperty(value = "The configuration id")
  public String getConfigId() {
    return configId;
  }

   /**
   * An optional configuration name
   * @return name
  **/
  @ApiModelProperty(value = "An optional configuration name")
  public String getName() {
    return name;
  }

   /**
   * The last update date/time of this configuration in ISO 8601 format
   * @return updateTime
  **/
  @ApiModelProperty(value = "The last update date/time of this configuration in ISO 8601 format")
  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }

   /**
   * The status of the config action
   * @return configStatus
  **/
  @ApiModelProperty(value = "The status of the config action")
  public ConfigStatusEnum getConfigStatus() {
    return configStatus;
  }

  public StamperConfigResponse config(StamperConfig config) {
    this.config = config;
    return this;
  }

   /**
   * The PDF stamper configuration
   * @return config
  **/
  @ApiModelProperty(value = "The PDF stamper configuration")
  public StamperConfig getConfig() {
    return config;
  }

  public void setConfig(StamperConfig config) {
    this.config = config;
  }

   /**
   * A status message, which can be informational, warning or error. A message here does not indicate an error per se
   * @return statusMessage
  **/
  @ApiModelProperty(value = "A status message, which can be informational, warning or error. A message here does not indicate an error per se")
  public String getStatusMessage() {
    return statusMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StamperConfigResponse stamperConfigResponse = (StamperConfigResponse) o;
    return Objects.equals(this.configResources, stamperConfigResponse.configResources) &&
        Objects.equals(this.creationTime, stamperConfigResponse.creationTime) &&
        Objects.equals(this.configId, stamperConfigResponse.configId) &&
        Objects.equals(this.name, stamperConfigResponse.name) &&
        Objects.equals(this.updateTime, stamperConfigResponse.updateTime) &&
        Objects.equals(this.configStatus, stamperConfigResponse.configStatus) &&
        Objects.equals(this.config, stamperConfigResponse.config) &&
        Objects.equals(this.statusMessage, stamperConfigResponse.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configResources, creationTime, configId, name, updateTime, configStatus, config, statusMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StamperConfigResponse {\n");
    
    sb.append("    configResources: ").append(toIndentedString(configResources)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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

