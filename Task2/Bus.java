package Task2;

public class Bus extends Vehicle {
  String type = "Bus";

  public Bus(int maxSpeed, String type) {
    super(maxSpeed, type);
  }

  @Override
  public double getMaxSpeed() {
    return super.getMaxSpeed() * 0.6;
  }

  @Override
  public String getType() {
    return super.getType();
  }

  @Override
  public void setMaxSpeed(double maxSpeed) {
    super.setMaxSpeed(maxSpeed);
  }

  @Override
  public void setType(String type) {
    super.setType(type);
  }

}
