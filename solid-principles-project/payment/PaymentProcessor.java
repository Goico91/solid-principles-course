package payment;

public class PaymentProcessor {
  public void process(String method, double amount) {
    if (method.equals("credit")) {
      System.out.println("Processing credit card payment of " + amount);
    } else if (method.equals("paypal")) {
      System.out.println("Processing PayPal payment of " + amount);
    }
  }
}
