package wrong;

class PaymentProcessor {
  public void process(String method, double amount) {
    if (method.equals("credit")) {
      System.out.println("Pagando con tarjeta: " + amount);
    } else if (method.equals("paypal")) {
      System.out.println("Pagando con PayPal: " + amount);
    }
  }
}

public class OpenClosed {
  public static void main(String[] args) {
    PaymentProcessor paymentProcessor = new PaymentProcessor();
    paymentProcessor.process("credit", 10.0);
  }
}
