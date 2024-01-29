package Task4;

public class Square implements Area {
  private int width;

  public Square(int width) {
    this.width = width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public int area() {
    return this.width * 2;
  }

}
