package Task2;

public class Vehicle {
  double maxSpeed = 100;
  String type;

  public Vehicle(double maxSpeed, String type) {
    this.maxSpeed = maxSpeed;
    this.type = type;
  }

  public double getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(double maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
