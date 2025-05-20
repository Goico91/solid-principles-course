package wrong;

class Rectangle {
  protected int width;
  protected int height;

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getArea() {
    return width * height;
  }
}

class Square extends Rectangle {
  @Override
  public void setWidth(int width) {
    this.width = width;
    this.height = width;
  }

  @Override
  public void setHeight(int height) {
    this.width = height;
    this.height = height;
  }
}

public class LiskovSubstitution {
  public static void main(String[] args) {
    Rectangle rect = new Square();
    rect.setWidth(5);
    rect.setHeight(10);

    System.out.println("Área correcta: 50, Area actual: " + rect.getArea());
  }
}
