/*
 * Asana
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.asana.models.gen;

import java.util.Objects;
import java.util.Arrays;
import com.asana.models.gen.AsanaNamedResource;
import com.asana.models.gen.WebhookCompact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
/**
 * WebhookResponse
 */


public class WebhookResponse extends WebhookCompact {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("last_failure_at")
  private OffsetDateTime lastFailureAt = null;

  @SerializedName("last_failure_content")
  private String lastFailureContent = null;

  @SerializedName("last_success_at")
  private OffsetDateTime lastSuccessAt = null;

   /**
   * The time at which this resource was created.
   * @return createdAt
  **/
  @Schema(description = "The time at which this resource was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * The timestamp when the webhook last received an error when sending an event to the target.
   * @return lastFailureAt
  **/
  @Schema(description = "The timestamp when the webhook last received an error when sending an event to the target.")
  public OffsetDateTime getLastFailureAt() {
    return lastFailureAt;
  }

   /**
   * The contents of the last error response sent to the webhook when attempting to deliver events to the target.
   * @return lastFailureContent
  **/
  @Schema(example = "500 Server Error\\n\\nCould not complete the request", description = "The contents of the last error response sent to the webhook when attempting to deliver events to the target.")
  public String getLastFailureContent() {
    return lastFailureContent;
  }

   /**
   * The timestamp when the webhook last successfully sent an event to the target.
   * @return lastSuccessAt
  **/
  @Schema(description = "The timestamp when the webhook last successfully sent an event to the target.")
  public OffsetDateTime getLastSuccessAt() {
    return lastSuccessAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResponse webhookResponse = (WebhookResponse) o;
    return Objects.equals(this.createdAt, webhookResponse.createdAt) &&
        Objects.equals(this.lastFailureAt, webhookResponse.lastFailureAt) &&
        Objects.equals(this.lastFailureContent, webhookResponse.lastFailureContent) &&
        Objects.equals(this.lastSuccessAt, webhookResponse.lastSuccessAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, lastFailureAt, lastFailureContent, lastSuccessAt, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastFailureAt: ").append(toIndentedString(lastFailureAt)).append("\n");
    sb.append("    lastFailureContent: ").append(toIndentedString(lastFailureContent)).append("\n");
    sb.append("    lastSuccessAt: ").append(toIndentedString(lastSuccessAt)).append("\n");
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
