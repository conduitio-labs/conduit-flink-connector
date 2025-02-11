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
import io.conduit.client.model.Configv1Parameter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ProcessorPluginSpecifications describes the specifications of a processor plugin.
 */
@ApiModel(description = "ProcessorPluginSpecifications describes the specifications of a processor plugin.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-13T16:13:27.395+01:00")
public class V1ProcessorPluginSpecifications {
  @SerializedName("name")
  private String name = null;

  @SerializedName("summary")
  private String summary = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("author")
  private String author = null;

  @SerializedName("parameters")
  private Map<String, Configv1Parameter> parameters = null;

  public V1ProcessorPluginSpecifications name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the plugin.
   * @return name
  **/
  @ApiModelProperty(value = "Name is the name of the plugin.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ProcessorPluginSpecifications summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Summary is a brief description of the plugin and what it does, ideally not longer than one sentence.
   * @return summary
  **/
  @ApiModelProperty(value = "Summary is a brief description of the plugin and what it does, ideally not longer than one sentence.")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public V1ProcessorPluginSpecifications description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description is a longer form field, appropriate for README-like text that the author can provide for documentation about the usage of the plugin.
   * @return description
  **/
  @ApiModelProperty(value = "Description is a longer form field, appropriate for README-like text that the author can provide for documentation about the usage of the plugin.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V1ProcessorPluginSpecifications version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version string. Should follow semantic versioning and use the \&quot;v\&quot; prefix (e.g. v1.23.4).
   * @return version
  **/
  @ApiModelProperty(value = "Version string. Should follow semantic versioning and use the \"v\" prefix (e.g. v1.23.4).")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public V1ProcessorPluginSpecifications author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Author declares the entity that created or maintains this plugin.
   * @return author
  **/
  @ApiModelProperty(value = "Author declares the entity that created or maintains this plugin.")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public V1ProcessorPluginSpecifications parameters(Map<String, Configv1Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public V1ProcessorPluginSpecifications putParametersItem(String key, Configv1Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String, Configv1Parameter>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * A map that describes parameters available for configuring the processor plugin.
   * @return parameters
  **/
  @ApiModelProperty(value = "A map that describes parameters available for configuring the processor plugin.")
  public Map<String, Configv1Parameter> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, Configv1Parameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ProcessorPluginSpecifications v1ProcessorPluginSpecifications = (V1ProcessorPluginSpecifications) o;
    return Objects.equals(this.name, v1ProcessorPluginSpecifications.name) &&
        Objects.equals(this.summary, v1ProcessorPluginSpecifications.summary) &&
        Objects.equals(this.description, v1ProcessorPluginSpecifications.description) &&
        Objects.equals(this.version, v1ProcessorPluginSpecifications.version) &&
        Objects.equals(this.author, v1ProcessorPluginSpecifications.author) &&
        Objects.equals(this.parameters, v1ProcessorPluginSpecifications.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, summary, description, version, author, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ProcessorPluginSpecifications {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

