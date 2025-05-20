package correct;

interface Work {
  void work();
}

interface Eat {
  void eat();
}

interface Sleep {
  void sleep();
}

class HumanWorker implements Work, Eat, Sleep {
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

class RobotWorker implements Work {
  public void work() {
    System.out.println("Trabajando sin parar");
  }
}

public class InterfaceSegregation {
  public static void main(String[] args) {
    RobotWorker chatGPT = new RobotWorker();
    chatGPT.work();
    // chatGPT.eat();

    HumanWorker goico = new HumanWorker();
    goico.eat();
  }
}
