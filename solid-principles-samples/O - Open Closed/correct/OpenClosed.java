package correct;

interface PaymentMethod {
  void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
  public void pay(double amount) {
    System.out.println("Pagando con tarjeta: " + amount);
  }
}

class PayPalPayment implements PaymentMethod {
  public void pay(double amount) {
    System.out.println("Pagando con PayPal: " + amount);
  }
}

class PaymentProcessor {
  public void process(PaymentMethod method, double amount) {
    method.pay(amount);
  }
}

public class OpenClosed {
  public static void main(String[] args) {
    PaymentMethod paymentMethod = new CreditCardPayment();
    PaymentProcessor paymentProcessor = new PaymentProcessor();
    paymentProcessor.process(paymentMethod, 10.0);
  }
}
