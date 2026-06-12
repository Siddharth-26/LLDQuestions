package LLDQuestion.CarRentalSystem;

import java.util.Date;

public class VehicleQuery {
  private VehicleTypes vehicleType;
  private String pickupLocationId;
  private Date startDate;
  private Date endDate;
  private VehicleQuery(VehicleTypes vehicleType, String pickupLocationId, Date startDate, Date endDate) {
    this.vehicleType = vehicleType;
    this.pickupLocationId = pickupLocationId;
    this.startDate = startDate;
    this.endDate = endDate;
  }
  private static class Builder{
    private VehicleTypes vehicleType;
    private String pickupLocationId;
    private Date startDate;
    private Date endDate;
    public Builder vehicleType(VehicleTypes vehicleType) {
      this.vehicleType = vehicleType;
      return this;
    }
    public Builder pickupLocationId(String pickupLocationId) {
      this.pickupLocationId = pickupLocationId;
      return this;
    }
    public Builder startDate(Date startDate) {
      this.startDate = startDate;
      return this;
    }
    public Builder endDate(Date endDate) {
      this.endDate = endDate;
      return this;
    }
    public VehicleQuery build(){
      return new VehicleQuery(this.vehicleType, this.pickupLocationId, this.startDate, this.endDate);
    }
  }

  public VehicleTypes getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleTypes vehicleType) {
    this.vehicleType = vehicleType;
  }

  public String getPickupLocationId() {
    return pickupLocationId;
  }

  public void setPickupLocationId(String pickupLocationId) {
    this.pickupLocationId = pickupLocationId;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }
}
