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
import com.asana.models.gen.CustomFieldResponse;
import com.asana.models.gen.ProjectCompact;
import com.asana.models.gen.TagCompact;
import com.asana.models.gen.TaskBase;
import com.asana.models.gen.TaskBaseExternal;
import com.asana.models.gen.TaskBaseMemberships;
import com.asana.models.gen.UserCompact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * TaskResponse
 */


public class TaskResponse extends TaskBase {
  @SerializedName("assignee")
  private Object assignee = null;

  @SerializedName("followers")
  private List<UserCompact> followers = null;

  @SerializedName("parent")
  private Object parent = null;

  @SerializedName("projects")
  private List<ProjectCompact> projects = null;

  @SerializedName("tags")
  private List<TagCompact> tags = null;

  @SerializedName("workspace")
  private Object workspace = null;

  public TaskResponse assignee(Object assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @Schema(description = "")
  public Object getAssignee() {
    return assignee;
  }

  public void setAssignee(Object assignee) {
    this.assignee = assignee;
  }

   /**
   * Array of users following this task.
   * @return followers
  **/
  @Schema(description = "Array of users following this task.")
  public List<UserCompact> getFollowers() {
    return followers;
  }

  public TaskResponse parent(Object parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @Schema(description = "")
  public Object getParent() {
    return parent;
  }

  public void setParent(Object parent) {
    this.parent = parent;
  }

   /**
   * *Create-only.* Array of projects this task is associated with. At task creation time, this array can be used to add the task to many projects at once. After task creation, these associations can be modified using the addProject and removeProject endpoints.
   * @return projects
  **/
  @Schema(description = "*Create-only.* Array of projects this task is associated with. At task creation time, this array can be used to add the task to many projects at once. After task creation, these associations can be modified using the addProject and removeProject endpoints.")
  public List<ProjectCompact> getProjects() {
    return projects;
  }

   /**
   * Array of tags associated with this task. In order to change tags on an existing task use &#x60;addTag&#x60; and &#x60;removeTag&#x60;.
   * @return tags
  **/
  @Schema(example = "[{\"gid\":\"59746\",\"name\":\"Grade A\"}]", description = "Array of tags associated with this task. In order to change tags on an existing task use `addTag` and `removeTag`.")
  public List<TagCompact> getTags() {
    return tags;
  }

  public TaskResponse workspace(Object workspace) {
    this.workspace = workspace;
    return this;
  }

   /**
   * Get workspace
   * @return workspace
  **/
  @Schema(description = "")
  public Object getWorkspace() {
    return workspace;
  }

  public void setWorkspace(Object workspace) {
    this.workspace = workspace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskResponse taskResponse = (TaskResponse) o;
    return Objects.equals(this.assignee, taskResponse.assignee) &&
        Objects.equals(this.followers, taskResponse.followers) &&
        Objects.equals(this.parent, taskResponse.parent) &&
        Objects.equals(this.projects, taskResponse.projects) &&
        Objects.equals(this.tags, taskResponse.tags) &&
        Objects.equals(this.workspace, taskResponse.workspace) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, followers, parent, projects, tags, workspace, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
