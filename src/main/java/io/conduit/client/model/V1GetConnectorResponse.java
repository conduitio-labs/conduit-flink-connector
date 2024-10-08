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
import io.conduit.client.model.V1Connector;
import java.io.IOException;

/**
 * V1GetConnectorResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-13T16:13:27.395+01:00")
public class V1GetConnectorResponse {
  @SerializedName("connector")
  private V1Connector connector = null;

  public V1GetConnectorResponse connector(V1Connector connector) {
    this.connector = connector;
    return this;
  }

   /**
   * Get connector
   * @return connector
  **/
  @ApiModelProperty(value = "")
  public V1Connector getConnector() {
    return connector;
  }

  public void setConnector(V1Connector connector) {
    this.connector = connector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1GetConnectorResponse v1GetConnectorResponse = (V1GetConnectorResponse) o;
    return Objects.equals(this.connector, v1GetConnectorResponse.connector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1GetConnectorResponse {\n");
    
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
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

