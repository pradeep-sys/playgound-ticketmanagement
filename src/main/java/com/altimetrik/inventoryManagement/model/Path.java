package com.altimetrik.inventoryManagement.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Path
 */
@Validated

public class Path   {
  @JsonProperty("pathValue")
  private String pathValue = null;

  public Path pathValue(String pathValue) {
    this.pathValue = pathValue;
    return this;
  }

  /**
   * system path value
   * @return pathValue
  **/
  @ApiModelProperty(value = "system path value")


  public String getPathValue() {
    return pathValue;
  }

  public void setPathValue(String pathValue) {
    this.pathValue = pathValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Path path = (Path) o;
    return Objects.equals(this.pathValue, path.pathValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Path {\n");
    
    sb.append("    pathValue: ").append(toIndentedString(pathValue)).append("\n");
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

