package com.altimetrik.inventoryManagement.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * Battery
 */
@Validated

public class Battery   {
  @JsonProperty("batteryId")
  private Integer batteryId = null;

  @JsonProperty("inventoryId")
  private String inventoryId = null;

  @JsonProperty("batteryTypeId")
  private Integer batteryTypeId = null;

  @JsonProperty("betteryModel")
  private String betteryModel = null;

  @JsonProperty("batteryWeight")
  private Integer batteryWeight = null;

  @JsonProperty("batteryManfucturingDate")
  private String batteryManfucturingDate = null;

  @JsonProperty("batteryExpirationDate")
  private String batteryExpirationDate = null;

  @JsonProperty("batteryCreateDate")
  private String batteryCreateDate = null;

  @JsonProperty("batteryLastUpdateDate")
  private String batteryLastUpdateDate = null;

  @JsonProperty("batteryLastChargeDate")
  private String batteryLastChargeDate = null;

  @JsonProperty("batteryChargeDate")
  private String batteryChargeDate = null;

  @JsonProperty("batteryCurrentLocation")
  private String batteryCurrentLocation = null;

  /**
   * battery current location
   */
  public enum BatteryStatusEnum {
    CHARGED("charged"),
    
    DISCHARGED("discharged"),
    
    DISPUTED("disputed");

    private String value;

    BatteryStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BatteryStatusEnum fromValue(String text) {
      for (BatteryStatusEnum b : BatteryStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("batteryStatus")
  private BatteryStatusEnum batteryStatus = null;

  @JsonProperty("vendorId")
  private String vendorId = null;

  @JsonProperty("vehicleBrand")
  private String vehicleBrand = null;

  @JsonProperty("batteryCapacity")
  private String batteryCapacity = null;

  @JsonProperty("batteryBrand")
  private String batteryBrand = null;

  @JsonProperty("voltageOutput")
  private String voltageOutput = null;

  @JsonProperty("vehicleModelName")
  private String vehicleModelName = null;

  @JsonProperty("batteryCost")
  private Integer batteryCost = null;

  public Battery batteryId(Integer batteryId) {
    this.batteryId = batteryId;
    return this;
  }

  /**
   * battery unique identifier
   * @return batteryId
  **/
  @ApiModelProperty(value = "battery unique identifier")


  public Integer getBatteryId() {
    return batteryId;
  }

  public void setBatteryId(Integer batteryId) {
    this.batteryId = batteryId;
  }

  public Battery inventoryId(String inventoryId) {
    this.inventoryId = inventoryId;
    return this;
  }

  /**
   * inventory identifier
   * @return inventoryId
  **/
  @ApiModelProperty(value = "inventory identifier")


  public String getInventoryId() {
    return inventoryId;
  }

  public void setInventoryId(String inventoryId) {
    this.inventoryId = inventoryId;
  }

  public Battery batteryTypeId(Integer batteryTypeId) {
    this.batteryTypeId = batteryTypeId;
    return this;
  }

  /**
   * type of battery identifier
   * @return batteryTypeId
  **/
  @ApiModelProperty(value = "type of battery identifier")


  public Integer getBatteryTypeId() {
    return batteryTypeId;
  }

  public void setBatteryTypeId(Integer batteryTypeId) {
    this.batteryTypeId = batteryTypeId;
  }

  public Battery betteryModel(String betteryModel) {
    this.betteryModel = betteryModel;
    return this;
  }

  /**
   * battery model details
   * @return betteryModel
  **/
  @ApiModelProperty(value = "battery model details")


  public String getBetteryModel() {
    return betteryModel;
  }

  public void setBetteryModel(String betteryModel) {
    this.betteryModel = betteryModel;
  }

  public Battery batteryWeight(Integer batteryWeight) {
    this.batteryWeight = batteryWeight;
    return this;
  }

  /**
   * battery weight
   * @return batteryWeight
  **/
  @ApiModelProperty(value = "battery weight")


  public Integer getBatteryWeight() {
    return batteryWeight;
  }

  public void setBatteryWeight(Integer batteryWeight) {
    this.batteryWeight = batteryWeight;
  }

  public Battery batteryManfucturingDate(String batteryManfucturingDate) {
    this.batteryManfucturingDate = batteryManfucturingDate;
    return this;
  }

  /**
   * battery manufacturing date
   * @return batteryManfucturingDate
  **/
  @ApiModelProperty(value = "battery manufacturing date")


  public String getBatteryManfucturingDate() {
    return batteryManfucturingDate;
  }

  public void setBatteryManfucturingDate(String batteryManfucturingDate) {
    this.batteryManfucturingDate = batteryManfucturingDate;
  }

  public Battery batteryExpirationDate(String batteryExpirationDate) {
    this.batteryExpirationDate = batteryExpirationDate;
    return this;
  }

  /**
   * battery expiration date
   * @return batteryExpirationDate
  **/
  @ApiModelProperty(value = "battery expiration date")


  public String getBatteryExpirationDate() {
    return batteryExpirationDate;
  }

  public void setBatteryExpirationDate(String batteryExpirationDate) {
    this.batteryExpirationDate = batteryExpirationDate;
  }

  public Battery batteryCreateDate(String batteryCreateDate) {
    this.batteryCreateDate = batteryCreateDate;
    return this;
  }

  /**
   * battery creation date
   * @return batteryCreateDate
  **/
  @ApiModelProperty(value = "battery creation date")


  public String getBatteryCreateDate() {
    return batteryCreateDate;
  }

  public void setBatteryCreateDate(String batteryCreateDate) {
    this.batteryCreateDate = batteryCreateDate;
  }

  public Battery batteryLastUpdateDate(String batteryLastUpdateDate) {
    this.batteryLastUpdateDate = batteryLastUpdateDate;
    return this;
  }

  /**
   * battery last update date
   * @return batteryLastUpdateDate
  **/
  @ApiModelProperty(value = "battery last update date")


  public String getBatteryLastUpdateDate() {
    return batteryLastUpdateDate;
  }

  public void setBatteryLastUpdateDate(String batteryLastUpdateDate) {
    this.batteryLastUpdateDate = batteryLastUpdateDate;
  }

  public Battery batteryLastChargeDate(String batteryLastChargeDate) {
    this.batteryLastChargeDate = batteryLastChargeDate;
    return this;
  }

  /**
   * battery last charge date
   * @return batteryLastChargeDate
  **/
  @ApiModelProperty(value = "battery last charge date")


  public String getBatteryLastChargeDate() {
    return batteryLastChargeDate;
  }

  public void setBatteryLastChargeDate(String batteryLastChargeDate) {
    this.batteryLastChargeDate = batteryLastChargeDate;
  }

  public Battery batteryChargeDate(String batteryChargeDate) {
    this.batteryChargeDate = batteryChargeDate;
    return this;
  }

  /**
   * battery charge date
   * @return batteryChargeDate
  **/
  @ApiModelProperty(value = "battery charge date")


  public String getBatteryChargeDate() {
    return batteryChargeDate;
  }

  public void setBatteryChargeDate(String batteryChargeDate) {
    this.batteryChargeDate = batteryChargeDate;
  }

  public Battery batteryCurrentLocation(String batteryCurrentLocation) {
    this.batteryCurrentLocation = batteryCurrentLocation;
    return this;
  }

  /**
   * battery current location
   * @return batteryCurrentLocation
  **/
  @ApiModelProperty(value = "battery current location")


  public String getBatteryCurrentLocation() {
    return batteryCurrentLocation;
  }

  public void setBatteryCurrentLocation(String batteryCurrentLocation) {
    this.batteryCurrentLocation = batteryCurrentLocation;
  }

  public Battery batteryStatus(BatteryStatusEnum batteryStatus) {
    this.batteryStatus = batteryStatus;
    return this;
  }

  /**
   * battery current location
   * @return batteryStatus
  **/
  @ApiModelProperty(value = "battery current location")


  public BatteryStatusEnum getBatteryStatus() {
    return batteryStatus;
  }

  public void setBatteryStatus(BatteryStatusEnum batteryStatus) {
    this.batteryStatus = batteryStatus;
  }

  public Battery vendorId(String vendorId) {
    this.vendorId = vendorId;
    return this;
  }

  /**
   * vendor id
   * @return vendorId
  **/
  @ApiModelProperty(value = "vendor id")


  public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  public Battery vehicleBrand(String vehicleBrand) {
    this.vehicleBrand = vehicleBrand;
    return this;
  }

  /**
   * vehicle brand
   * @return vehicleBrand
  **/
  @ApiModelProperty(value = "vehicle brand")


  public String getVehicleBrand() {
    return vehicleBrand;
  }

  public void setVehicleBrand(String vehicleBrand) {
    this.vehicleBrand = vehicleBrand;
  }

  public Battery batteryCapacity(String batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
    return this;
  }

  /**
   * battery capacity
   * @return batteryCapacity
  **/
  @ApiModelProperty(value = "battery capacity")


  public String getBatteryCapacity() {
    return batteryCapacity;
  }

  public void setBatteryCapacity(String batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
  }

  public Battery batteryBrand(String batteryBrand) {
    this.batteryBrand = batteryBrand;
    return this;
  }

  /**
   * brand name of battery
   * @return batteryBrand
  **/
  @ApiModelProperty(value = "brand name of battery")


  public String getBatteryBrand() {
    return batteryBrand;
  }

  public void setBatteryBrand(String batteryBrand) {
    this.batteryBrand = batteryBrand;
  }

  public Battery voltageOutput(String voltageOutput) {
    this.voltageOutput = voltageOutput;
    return this;
  }

  /**
   * voltage output
   * @return voltageOutput
  **/
  @ApiModelProperty(value = "voltage output")


  public String getVoltageOutput() {
    return voltageOutput;
  }

  public void setVoltageOutput(String voltageOutput) {
    this.voltageOutput = voltageOutput;
  }

  public Battery vehicleModelName(String vehicleModelName) {
    this.vehicleModelName = vehicleModelName;
    return this;
  }

  /**
   * vehicle model name
   * @return vehicleModelName
  **/
  @ApiModelProperty(value = "vehicle model name")


  public String getVehicleModelName() {
    return vehicleModelName;
  }

  public void setVehicleModelName(String vehicleModelName) {
    this.vehicleModelName = vehicleModelName;
  }

  public Battery batteryCost(Integer batteryCost) {
    this.batteryCost = batteryCost;
    return this;
  }

  /**
   * battery amount 
   * @return batteryCost
  **/
  @ApiModelProperty(value = "battery amount ")


  public Integer getBatteryCost() {
    return batteryCost;
  }

  public void setBatteryCost(Integer batteryCost) {
    this.batteryCost = batteryCost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Battery battery = (Battery) o;
    return Objects.equals(this.batteryId, battery.batteryId) &&
        Objects.equals(this.inventoryId, battery.inventoryId) &&
        Objects.equals(this.batteryTypeId, battery.batteryTypeId) &&
        Objects.equals(this.betteryModel, battery.betteryModel) &&
        Objects.equals(this.batteryWeight, battery.batteryWeight) &&
        Objects.equals(this.batteryManfucturingDate, battery.batteryManfucturingDate) &&
        Objects.equals(this.batteryExpirationDate, battery.batteryExpirationDate) &&
        Objects.equals(this.batteryCreateDate, battery.batteryCreateDate) &&
        Objects.equals(this.batteryLastUpdateDate, battery.batteryLastUpdateDate) &&
        Objects.equals(this.batteryLastChargeDate, battery.batteryLastChargeDate) &&
        Objects.equals(this.batteryChargeDate, battery.batteryChargeDate) &&
        Objects.equals(this.batteryCurrentLocation, battery.batteryCurrentLocation) &&
        Objects.equals(this.batteryStatus, battery.batteryStatus) &&
        Objects.equals(this.vendorId, battery.vendorId) &&
        Objects.equals(this.vehicleBrand, battery.vehicleBrand) &&
        Objects.equals(this.batteryCapacity, battery.batteryCapacity) &&
        Objects.equals(this.batteryBrand, battery.batteryBrand) &&
        Objects.equals(this.voltageOutput, battery.voltageOutput) &&
        Objects.equals(this.vehicleModelName, battery.vehicleModelName) &&
        Objects.equals(this.batteryCost, battery.batteryCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batteryId, inventoryId, batteryTypeId, betteryModel, batteryWeight, batteryManfucturingDate, batteryExpirationDate, batteryCreateDate, batteryLastUpdateDate, batteryLastChargeDate, batteryChargeDate, batteryCurrentLocation, batteryStatus, vendorId, vehicleBrand, batteryCapacity, batteryBrand, voltageOutput, vehicleModelName, batteryCost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Battery {\n");
    
    sb.append("    batteryId: ").append(toIndentedString(batteryId)).append("\n");
    sb.append("    inventoryId: ").append(toIndentedString(inventoryId)).append("\n");
    sb.append("    batteryTypeId: ").append(toIndentedString(batteryTypeId)).append("\n");
    sb.append("    betteryModel: ").append(toIndentedString(betteryModel)).append("\n");
    sb.append("    batteryWeight: ").append(toIndentedString(batteryWeight)).append("\n");
    sb.append("    batteryManfucturingDate: ").append(toIndentedString(batteryManfucturingDate)).append("\n");
    sb.append("    batteryExpirationDate: ").append(toIndentedString(batteryExpirationDate)).append("\n");
    sb.append("    batteryCreateDate: ").append(toIndentedString(batteryCreateDate)).append("\n");
    sb.append("    batteryLastUpdateDate: ").append(toIndentedString(batteryLastUpdateDate)).append("\n");
    sb.append("    batteryLastChargeDate: ").append(toIndentedString(batteryLastChargeDate)).append("\n");
    sb.append("    batteryChargeDate: ").append(toIndentedString(batteryChargeDate)).append("\n");
    sb.append("    batteryCurrentLocation: ").append(toIndentedString(batteryCurrentLocation)).append("\n");
    sb.append("    batteryStatus: ").append(toIndentedString(batteryStatus)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    vehicleBrand: ").append(toIndentedString(vehicleBrand)).append("\n");
    sb.append("    batteryCapacity: ").append(toIndentedString(batteryCapacity)).append("\n");
    sb.append("    batteryBrand: ").append(toIndentedString(batteryBrand)).append("\n");
    sb.append("    voltageOutput: ").append(toIndentedString(voltageOutput)).append("\n");
    sb.append("    vehicleModelName: ").append(toIndentedString(vehicleModelName)).append("\n");
    sb.append("    batteryCost: ").append(toIndentedString(batteryCost)).append("\n");
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

