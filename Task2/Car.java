package Task2;

public class Car extends Vehicle {
  String type = "Car";

  public Car(int maxSpeed, String type) {
    super(maxSpeed, type);
  }

  @Override
  public double getMaxSpeed() {
    return super.getMaxSpeed() * 0.8;
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
