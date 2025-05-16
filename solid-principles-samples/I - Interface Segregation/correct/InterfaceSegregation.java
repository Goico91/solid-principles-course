package correct;

interface Workable {
  void work();
}

interface Eatable {
  void eat();
}

interface Sleepable {
  void sleep();
}

class HumanWorker implements Workable, Eatable, Sleepable {
  public void work() {
    System.out.println("Trabajando");
  }

  public void eat() {
    System.out.println("Comiendo");
  }

  public void sleep() {
    System.out.println("Durmiendo");
  }
}

class RobotWorker implements Workable {
  public void work() {
    System.out.println("Trabajando sin parar");
  }
}

public class InterfaceSegregation {
  public static void main(String[] args) {}
}
