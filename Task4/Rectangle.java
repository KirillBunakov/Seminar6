package Task4;

public class Rectangle implements Area, Cos {
  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public int area() {
    return this.width * this.height;
  }

  @Override
  public double cos() {
    // TODO Auto-generated method stub
    return 0;
  }
}