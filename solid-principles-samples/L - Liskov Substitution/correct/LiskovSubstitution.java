package correct;

interface Shape {
  int getArea();
}

class Rectangle implements Shape {
  private final int width;
  private final int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getArea() {
    return width * height;
  }
}

class Square implements Shape {
  private final int side;

  public Square(int side) {
    this.side = side;
  }

  public int getArea() {
    return side * side;
  }
}

public class LiskovSubstitution {
  public static void main(String[] args) {
    Shape rect = new Rectangle(5, 10);
    Shape square = new Square(5);
    System.out.println("Área del rectángulo: " + rect.getArea());
    System.out.println("Área del cuadrado: " + square.getArea());
  }
}
