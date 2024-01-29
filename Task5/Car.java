package Task5;

public class Car {

  public static void main(String[] args) {
    DieselCar bmw530d = new DieselCar("BMW", 220);
    PetrolCar octavia = new PetrolCar("Skoda", 230);
    System.out.println(bmw530d + bmw530d.startEngine());
    System.out.println(octavia + octavia.startEngine());
  }
}
