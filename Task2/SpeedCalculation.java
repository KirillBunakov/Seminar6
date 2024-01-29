package Task2;

public class SpeedCalculation {

  public static void main(String[] args) {
    Car octavia = new Car(200, "Car");
    System.out.println(octavia.getType());
    System.out.println(octavia.getMaxSpeed());

    System.out.println("---------");
    Bus lias = new Bus(140, "Bus");
    System.out.println(lias.getType());
    System.out.println(lias.getMaxSpeed());
  }
}
