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
import com.sphereon.sdk.pdf.stamper.model.InputResources;
import com.sphereon.sdk.pdf.stamper.model.PdfStamperJobSettings;
import com.sphereon.sdk.pdf.stamper.model.ResultResources;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The PDF Stamper job.
 */
@ApiModel(description = "The PDF Stamper job.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-03T17:44:37.086+01:00")
public class PdfStamperJobContainer {
  @SerializedName("result")
  private ResultResources result = null;

  @SerializedName("completionTime")
  private OffsetDateTime completionTime = null;

  @SerializedName("input")
  private InputResources input = null;

  @SerializedName("jobId")
  private String jobId = null;

  @SerializedName("settings")
  private PdfStamperJobSettings settings = null;

  /**
   * The status of the job
   */
  @JsonAdapter(JobStatusEnum.Adapter.class)
  public enum JobStatusEnum {
    CREATED("CREATED"),
    
    INPUTS_UPLOADED("INPUTS_UPLOADED"),
    
    PROCESSING("PROCESSING"),
    
    DONE("DONE"),
    
    ERROR("ERROR"),
    
    DELETED("DELETED");

    private String value;

    JobStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JobStatusEnum fromValue(String text) {
      for (JobStatusEnum b : JobStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<JobStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JobStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JobStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return JobStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("jobStatus")
  private JobStatusEnum jobStatus = null;

  @SerializedName("creationTime")
  private OffsetDateTime creationTime = null;

  @SerializedName("updateTime")
  private OffsetDateTime updateTime = null;

  @SerializedName("statusMessage")
  private String statusMessage = null;

  @SerializedName("queueTime")
  private OffsetDateTime queueTime = null;

  public PdfStamperJobContainer result(ResultResources result) {
    this.result = result;
    return this;
  }

   /**
   * The result(s)
   * @return result
  **/
  @ApiModelProperty(value = "The result(s)")
  public ResultResources getResult() {
    return result;
  }

  public void setResult(ResultResources result) {
    this.result = result;
  }

   /**
   * The completion date/time of this job in ISO 8601 format
   * @return completionTime
  **/
  @ApiModelProperty(value = "The completion date/time of this job in ISO 8601 format")
  public OffsetDateTime getCompletionTime() {
    return completionTime;
  }

  public PdfStamperJobContainer input(InputResources input) {
    this.input = input;
    return this;
  }

   /**
   * The input(s)
   * @return input
  **/
  @ApiModelProperty(value = "The input(s)")
  public InputResources getInput() {
    return input;
  }

  public void setInput(InputResources input) {
    this.input = input;
  }

   /**
   * The job id
   * @return jobId
  **/
  @ApiModelProperty(value = "The job id")
  public String getJobId() {
    return jobId;
  }

  public PdfStamperJobContainer settings(PdfStamperJobSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * The settings used during executing the PDF Stamper job
   * @return settings
  **/
  @ApiModelProperty(value = "The settings used during executing the PDF Stamper job")
  public PdfStamperJobSettings getSettings() {
    return settings;
  }

  public void setSettings(PdfStamperJobSettings settings) {
    this.settings = settings;
  }

   /**
   * The status of the job
   * @return jobStatus
  **/
  @ApiModelProperty(value = "The status of the job")
  public JobStatusEnum getJobStatus() {
    return jobStatus;
  }

   /**
   * The creation date/time of this job in ISO 8601 format
   * @return creationTime
  **/
  @ApiModelProperty(value = "The creation date/time of this job in ISO 8601 format")
  public OffsetDateTime getCreationTime() {
    return creationTime;
  }

   /**
   * The last update date/time of this job in ISO 8601 format
   * @return updateTime
  **/
  @ApiModelProperty(value = "The last update date/time of this job in ISO 8601 format")
  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }

   /**
   * A status message, which can be informational, warning or error. AA message here does not indicate an error per se
   * @return statusMessage
  **/
  @ApiModelProperty(value = "A status message, which can be informational, warning or error. AA message here does not indicate an error per se")
  public String getStatusMessage() {
    return statusMessage;
  }

   /**
   * The PDF Stamper queue date/time of this job in ISO 8601 format
   * @return queueTime
  **/
  @ApiModelProperty(value = "The PDF Stamper queue date/time of this job in ISO 8601 format")
  public OffsetDateTime getQueueTime() {
    return queueTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfStamperJobContainer pdfStamperJobContainer = (PdfStamperJobContainer) o;
    return Objects.equals(this.result, pdfStamperJobContainer.result) &&
        Objects.equals(this.completionTime, pdfStamperJobContainer.completionTime) &&
        Objects.equals(this.input, pdfStamperJobContainer.input) &&
        Objects.equals(this.jobId, pdfStamperJobContainer.jobId) &&
        Objects.equals(this.settings, pdfStamperJobContainer.settings) &&
        Objects.equals(this.jobStatus, pdfStamperJobContainer.jobStatus) &&
        Objects.equals(this.creationTime, pdfStamperJobContainer.creationTime) &&
        Objects.equals(this.updateTime, pdfStamperJobContainer.updateTime) &&
        Objects.equals(this.statusMessage, pdfStamperJobContainer.statusMessage) &&
        Objects.equals(this.queueTime, pdfStamperJobContainer.queueTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, completionTime, input, jobId, settings, jobStatus, creationTime, updateTime, statusMessage, queueTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfStamperJobContainer {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    queueTime: ").append(toIndentedString(queueTime)).append("\n");
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

