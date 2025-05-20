package wrong;

interface Worker {
  void work();

  void eat();

  void sleep();

  void restMode();
}

class RobotWorker implements Worker {
  public void work() {
    System.out.println("Trabajando sin parar");
  }

  public void eat() {
    // No aplica
    throw new UnsupportedOperationException();
  }

  public void sleep() {
    // No aplica
    throw new UnsupportedOperationException();
  }

  public void restMode() {
    System.out.println("Recuperando energía");
  }
}

class HumanWorker implements Worker {
  public void work() {
    System.out.println("Trabajando sin parar");
  }

  public void eat() {
    System.out.println("Comiendo");
  }

  public void sleep() {
    System.out.println("Durmiendo");
  }

  public void restMode() {
    // No aplica
    throw new UnsupportedOperationException();
  }
}

public class InterfaceSegregation {
  public static void main(String[] args) {
    RobotWorker chatGPT = new RobotWorker();
    chatGPT.eat();

    HumanWorker goico = new HumanWorker();
    goico.eat();
  }
}
