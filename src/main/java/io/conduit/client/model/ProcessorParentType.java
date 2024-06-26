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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Type shows the processor&#39;s parent type.   - TYPE_CONNECTOR: Processor parent is a connector.  - TYPE_PIPELINE: Processor parent is a pipeline.
 */
@JsonAdapter(ProcessorParentType.Adapter.class)
public enum ProcessorParentType {
  
  UNSPECIFIED("TYPE_UNSPECIFIED"),
  
  CONNECTOR("TYPE_CONNECTOR"),
  
  PIPELINE("TYPE_PIPELINE");

  private String value;

  ProcessorParentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ProcessorParentType fromValue(String text) {
    for (ProcessorParentType b : ProcessorParentType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ProcessorParentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ProcessorParentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ProcessorParentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ProcessorParentType.fromValue(String.valueOf(value));
    }
  }
}

