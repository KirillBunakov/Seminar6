package Task1;

import java.sql.Date;

public class Salary extends Employee {

  public Salary(String name, Date dob, int baseSalary) {
    super(name, dob, baseSalary);
  }

  public int calculateNetSalary() {
    int tax = (int) (baseSalary * 0.25);// calculate in otherway
    return baseSalary - tax;
  }
}
