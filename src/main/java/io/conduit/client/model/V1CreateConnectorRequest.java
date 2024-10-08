/*
 * Conduit REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.conduit.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.conduit.client.model.V1ConnectorConfig;
import io.conduit.client.model.V1ConnectorType;
import java.io.IOException;

/**
 * V1CreateConnectorRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-13T16:13:27.395+01:00")
public class V1CreateConnectorRequest {
  @SerializedName("type")
  private V1ConnectorType type = null;

  @SerializedName("plugin")
  private String plugin = null;

  @SerializedName("pipelineId")
  private String pipelineId = null;

  @SerializedName("config")
  private V1ConnectorConfig config = null;

  public V1CreateConnectorRequest type(V1ConnectorType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public V1ConnectorType getType() {
    return type;
  }

  public void setType(V1ConnectorType type) {
    this.type = type;
  }

  public V1CreateConnectorRequest plugin(String plugin) {
    this.plugin = plugin;
    return this;
  }

   /**
   * Get plugin
   * @return plugin
  **/
  @ApiModelProperty(value = "")
  public String getPlugin() {
    return plugin;
  }

  public void setPlugin(String plugin) {
    this.plugin = plugin;
  }

  public V1CreateConnectorRequest pipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
    return this;
  }

   /**
   * ID of the pipeline to which the connector will get attached.
   * @return pipelineId
  **/
  @ApiModelProperty(value = "ID of the pipeline to which the connector will get attached.")
  public String getPipelineId() {
    return pipelineId;
  }

  public void setPipelineId(String pipelineId) {
    this.pipelineId = pipelineId;
  }

  public V1CreateConnectorRequest config(V1ConnectorConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(value = "")
  public V1ConnectorConfig getConfig() {
    return config;
  }

  public void setConfig(V1ConnectorConfig config) {
    this.config = config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1CreateConnectorRequest v1CreateConnectorRequest = (V1CreateConnectorRequest) o;
    return Objects.equals(this.type, v1CreateConnectorRequest.type) &&
        Objects.equals(this.plugin, v1CreateConnectorRequest.plugin) &&
        Objects.equals(this.pipelineId, v1CreateConnectorRequest.pipelineId) &&
        Objects.equals(this.config, v1CreateConnectorRequest.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, plugin, pipelineId, config);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CreateConnectorRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    plugin: ").append(toIndentedString(plugin)).append("\n");
    sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

