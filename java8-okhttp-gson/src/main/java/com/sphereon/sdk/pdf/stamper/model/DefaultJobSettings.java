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
import com.sphereon.sdk.pdf.stamper.model.InputSettings;
import com.sphereon.sdk.pdf.stamper.model.ResultSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Default PDF Stamper job settings
 */
@ApiModel(description = "Default PDF Stamper job settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-27T02:48:32.481+01:00")
public class DefaultJobSettings {
  @SerializedName("variables")
  private Map<String, String> variables = null;

  @SerializedName("resultSettings")
  private ResultSettings resultSettings = null;

  @SerializedName("inputSettings")
  private InputSettings inputSettings = null;

  public DefaultJobSettings variables(Map<String, String> variables) {
    this.variables = variables;
    return this;
  }

  public DefaultJobSettings putVariablesItem(String key, String variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * A map with key-values used to replace template variables in components. These are optional defaults. Values in job specific variables will overwrite default values.
   * @return variables
  **/
  @ApiModelProperty(value = "A map with key-values used to replace template variables in components. These are optional defaults. Values in job specific variables will overwrite default values.")
  public Map<String, String> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, String> variables) {
    this.variables = variables;
  }

  public DefaultJobSettings resultSettings(ResultSettings resultSettings) {
    this.resultSettings = resultSettings;
    return this;
  }

   /**
   * The default result file and lifecycle settings
   * @return resultSettings
  **/
  @ApiModelProperty(value = "The default result file and lifecycle settings")
  public ResultSettings getResultSettings() {
    return resultSettings;
  }

  public void setResultSettings(ResultSettings resultSettings) {
    this.resultSettings = resultSettings;
  }

  public DefaultJobSettings inputSettings(InputSettings inputSettings) {
    this.inputSettings = inputSettings;
    return this;
  }

   /**
   * The default input file and lifecycle settings
   * @return inputSettings
  **/
  @ApiModelProperty(value = "The default input file and lifecycle settings")
  public InputSettings getInputSettings() {
    return inputSettings;
  }

  public void setInputSettings(InputSettings inputSettings) {
    this.inputSettings = inputSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultJobSettings defaultJobSettings = (DefaultJobSettings) o;
    return Objects.equals(this.variables, defaultJobSettings.variables) &&
        Objects.equals(this.resultSettings, defaultJobSettings.resultSettings) &&
        Objects.equals(this.inputSettings, defaultJobSettings.inputSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables, resultSettings, inputSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultJobSettings {\n");
    
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    resultSettings: ").append(toIndentedString(resultSettings)).append("\n");
    sb.append("    inputSettings: ").append(toIndentedString(inputSettings)).append("\n");
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

