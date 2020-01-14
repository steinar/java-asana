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
import com.asana.models.gen.AsanaResource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * UserTaskListResponse
 */


public class UserTaskListResponse extends AsanaResource {
  @SerializedName("owner")
  private Object owner = null;

  @SerializedName("workspace")
  private Object workspace = null;

   /**
   * The owner of the user task list, i.e. the person whose My Tasks is represented by this resource.
   * @return owner
  **/
  @Schema(description = "The owner of the user task list, i.e. the person whose My Tasks is represented by this resource.")
  public Object getOwner() {
    return owner;
  }

   /**
   * The workspace in which the user task list is located.
   * @return workspace
  **/
  @Schema(description = "The workspace in which the user task list is located.")
  public Object getWorkspace() {
    return workspace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTaskListResponse userTaskListResponse = (UserTaskListResponse) o;
    return Objects.equals(this.owner, userTaskListResponse.owner) &&
        Objects.equals(this.workspace, userTaskListResponse.workspace) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, workspace, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTaskListResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
