package AmazonLocker;

public class Packet {
  private String packetName;
  private double area;

  public Packet(String packetName, double area) {
    this.packetName = packetName;
    this.area = area;
  }

  public String getPacketName() {
    return packetName;
  }

  public void setPacketName(String packetName) {
    this.packetName = packetName;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }
}
