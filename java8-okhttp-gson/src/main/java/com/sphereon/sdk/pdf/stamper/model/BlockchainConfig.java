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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The Blockchain configuration
 */
@ApiModel(description = "The Blockchain configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-09T08:19:21.333Z")
public class BlockchainConfig {
  /**
   * Gets or Sets blockchainAnchors
   */
  @JsonAdapter(BlockchainAnchorsEnum.Adapter.class)
  public enum BlockchainAnchorsEnum {
    BEFORE_STAMP("BEFORE_STAMP"),
    
    AFTER_STAMP("AFTER_STAMP");

    private String value;

    BlockchainAnchorsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BlockchainAnchorsEnum fromValue(String text) {
      for (BlockchainAnchorsEnum b : BlockchainAnchorsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BlockchainAnchorsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BlockchainAnchorsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BlockchainAnchorsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BlockchainAnchorsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("blockchainAnchors")
  private List<BlockchainAnchorsEnum> blockchainAnchors = new ArrayList<>();

  @SerializedName("proofConfigName")
  private String proofConfigName = null;

  public BlockchainConfig blockchainAnchors(List<BlockchainAnchorsEnum> blockchainAnchors) {
    this.blockchainAnchors = blockchainAnchors;
    return this;
  }

  public BlockchainConfig addBlockchainAnchorsItem(BlockchainAnchorsEnum blockchainAnchorsItem) {
    this.blockchainAnchors.add(blockchainAnchorsItem);
    return this;
  }

   /**
   * The states at which to create a blockchain anchor. This can be the original file (before stamp)the stamped file, or both
   * @return blockchainAnchors
  **/
  @ApiModelProperty(required = true, value = "The states at which to create a blockchain anchor. This can be the original file (before stamp)the stamped file, or both")
  public List<BlockchainAnchorsEnum> getBlockchainAnchors() {
    return blockchainAnchors;
  }

  public void setBlockchainAnchors(List<BlockchainAnchorsEnum> blockchainAnchors) {
    this.blockchainAnchors = blockchainAnchors;
  }

  public BlockchainConfig proofConfigName(String proofConfigName) {
    this.proofConfigName = proofConfigName;
    return this;
  }

   /**
   * The blockchain proof configuration name to use. The name has to be created in the blockchain-proof API
   * @return proofConfigName
  **/
  @ApiModelProperty(required = true, value = "The blockchain proof configuration name to use. The name has to be created in the blockchain-proof API")
  public String getProofConfigName() {
    return proofConfigName;
  }

  public void setProofConfigName(String proofConfigName) {
    this.proofConfigName = proofConfigName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockchainConfig blockchainConfig = (BlockchainConfig) o;
    return Objects.equals(this.blockchainAnchors, blockchainConfig.blockchainAnchors) &&
        Objects.equals(this.proofConfigName, blockchainConfig.proofConfigName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchainAnchors, proofConfigName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockchainConfig {\n");
    
    sb.append("    blockchainAnchors: ").append(toIndentedString(blockchainAnchors)).append("\n");
    sb.append("    proofConfigName: ").append(toIndentedString(proofConfigName)).append("\n");
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

