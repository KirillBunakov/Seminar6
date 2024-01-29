package Task5;

public class PetrolCar extends PetrolEngine {
  String model;
  int maxSpeed;

  public PetrolCar(String model, int maxSpeed) {
    this.model = model;
    this.maxSpeed = maxSpeed;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  @Override
  public String startEngine() {
    return super.startEngine();
  }

  @Override
  public String toString() {
    return "PetrolCar [model=" + model + ", maxSpeed=" + maxSpeed + "]";
  }
}
