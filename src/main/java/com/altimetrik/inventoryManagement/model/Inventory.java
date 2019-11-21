package com.altimetrik.inventoryManagement.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * Inventory
 */
@Validated
public class Inventory   {
  @JsonProperty("inventoryId")
  private Integer inventoryId = null;

  @JsonProperty("batteryId")
  private String batteryId = null;

  @JsonProperty("batteryModel")
  private String batteryModel = null;

  @JsonProperty("transactionByUser")
  private String transactionByUser = null;

  @JsonProperty("transactionByVendor")
  private String transactionByVendor = null;

  @JsonProperty("transactionDate")
  private String transactionDate = null;

  @JsonProperty("transactionRequestId")
  private String transactionRequestId = null;

  /**
   * inventory status
   */
  public enum InventoryStatusEnum {
    LOCKED("locked"),
    
    RELEASED("released"),
    
    CONSUMED("consumed");

    private String value;

    InventoryStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static InventoryStatusEnum fromValue(String text) {
      for (InventoryStatusEnum b : InventoryStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("inventoryStatus")
  private InventoryStatusEnum inventoryStatus = null;

  public Inventory inventoryId(Integer inventoryId) {
    this.inventoryId = inventoryId;
    return this;
  }

  /**
   * inventory id
   * @return inventoryId
  **/
  @ApiModelProperty(value = "inventory id")


  public Integer getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(Integer inventoryId) {
    this.inventoryId = inventoryId;
  }

  public Inventory batteryId(String batteryId) {
    this.batteryId = batteryId;
    return this;
  }

  /**
   * battery unique identifier
   * @return batteryId
  **/
  @ApiModelProperty(value = "battery unique identifier")


  public String getBatteryId() {
    return batteryId;
  }

  public void setBatteryId(String batteryId) {
    this.batteryId = batteryId;
  }

  public Inventory batteryModel(String batteryModel) {
    this.batteryModel = batteryModel;
    return this;
  }

  /**
   * battery model details
   * @return batteryModel
  **/
  @ApiModelProperty(value = "battery model details")


  public String getBatteryModel() {
    return batteryModel;
  }

  public void setBatteryModel(String batteryModel) {
    this.batteryModel = batteryModel;
  }

  public Inventory transactionByUser(String transactionByUser) {
    this.transactionByUser = transactionByUser;
    return this;
  }

  /**
   * the user who has done the transaction on the battery
   * @return transactionByUser
  **/
  @ApiModelProperty(value = "the user who has done the transaction on the battery")


  public String getTransactionByUser() {
    return transactionByUser;
  }

  public void setTransactionByUser(String transactionByUser) {
    this.transactionByUser = transactionByUser;
  }

  public Inventory transactionByVendor(String transactionByVendor) {
    this.transactionByVendor = transactionByVendor;
    return this;
  }

  /**
   * the vendor who has done the transction
   * @return transactionByVendor
  **/
  @ApiModelProperty(value = "the vendor who has done the transction")


  public String getTransactionByVendor() {
    return transactionByVendor;
  }

  public void setTransactionByVendor(String transactionByVendor) {
    this.transactionByVendor = transactionByVendor;
  }

  public Inventory transactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  /**
   * transction date
   * @return transactionDate
  **/
  @ApiModelProperty(value = "transction date")


  public String getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Inventory transactionRequestId(String transactionRequestId) {
    this.transactionRequestId = transactionRequestId;
    return this;
  }

  /**
   * transction request date
   * @return transactionRequestId
  **/
  @ApiModelProperty(value = "transction request date")


  public String getTransactionRequestId() {
    return transactionRequestId;
  }

  public void setTransactionRequestId(String transactionRequestId) {
    this.transactionRequestId = transactionRequestId;
  }

  public Inventory inventoryStatus(InventoryStatusEnum inventoryStatus) {
    this.inventoryStatus = inventoryStatus;
    return this;
  }

  /**
   * inventory status
   * @return inventoryStatus
  **/
  @ApiModelProperty(value = "inventory status")


  public InventoryStatusEnum getInventoryStatus() {
    return inventoryStatus;
  }

  public void setInventoryStatus(InventoryStatusEnum inventoryStatus) {
    this.inventoryStatus = inventoryStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inventory inventory = (Inventory) o;
    return Objects.equals(this.inventoryId, inventory.inventoryId) &&
        Objects.equals(this.batteryId, inventory.batteryId) &&
        Objects.equals(this.batteryModel, inventory.batteryModel) &&
        Objects.equals(this.transactionByUser, inventory.transactionByUser) &&
        Objects.equals(this.transactionByVendor, inventory.transactionByVendor) &&
        Objects.equals(this.transactionDate, inventory.transactionDate) &&
        Objects.equals(this.transactionRequestId, inventory.transactionRequestId) &&
        Objects.equals(this.inventoryStatus, inventory.inventoryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inventoryId, batteryId, batteryModel, transactionByUser, transactionByVendor, transactionDate, transactionRequestId, inventoryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inventory {\n");
    
    sb.append("    inventoryId: ").append(toIndentedString(inventoryId)).append("\n");
    sb.append("    batteryId: ").append(toIndentedString(batteryId)).append("\n");
    sb.append("    batteryModel: ").append(toIndentedString(batteryModel)).append("\n");
    sb.append("    transactionByUser: ").append(toIndentedString(transactionByUser)).append("\n");
    sb.append("    transactionByVendor: ").append(toIndentedString(transactionByVendor)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    transactionRequestId: ").append(toIndentedString(transactionRequestId)).append("\n");
    sb.append("    inventoryStatus: ").append(toIndentedString(inventoryStatus)).append("\n");
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

