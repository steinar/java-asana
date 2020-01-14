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
import com.asana.models.gen.TagCompact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TagBase
 */


public class TagBase extends TagCompact {
  /**
   * Color of the tag.
   */
  @JsonAdapter(ColorEnum.Adapter.class)
  public enum ColorEnum {
    DARK_PINK("dark-pink"),
    DARK_GREEN("dark-green"),
    DARK_BLUE("dark-blue"),
    DARK_RED("dark-red"),
    DARK_TEAL("dark-teal"),
    DARK_BROWN("dark-brown"),
    DARK_ORANGE("dark-orange"),
    DARK_PURPLE("dark-purple"),
    DARK_WARM_GRAY("dark-warm-gray"),
    LIGHT_PINK("light-pink"),
    LIGHT_GREEN("light-green"),
    LIGHT_BLUE("light-blue"),
    LIGHT_RED("light-red"),
    LIGHT_TEAL("light-teal"),
    LIGHT_BROWN("light-brown"),
    LIGHT_ORANGE("light-orange"),
    LIGHT_PURPLE("light-purple"),
    LIGHT_WARM_GRAY("light-warm-gray");

    private String value;

    ColorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ColorEnum fromValue(String text) {
      for (ColorEnum b : ColorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ColorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ColorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ColorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ColorEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("color")
  private ColorEnum color = null;

  public TagBase color(ColorEnum color) {
    this.color = color;
    return this;
  }

   /**
   * Color of the tag.
   * @return color
  **/
  @Schema(example = "light-green", description = "Color of the tag.")
  public ColorEnum getColor() {
    return color;
  }

  public void setColor(ColorEnum color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagBase tagBase = (TagBase) o;
    return Objects.equals(this.color, tagBase.color) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagBase {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
