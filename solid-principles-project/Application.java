import model.Customer;
import model.PremiumCustomer;
import payment.PaymentProcessor;
import service.InvoiceManager;
import service.OrderService;

public class Application {
  private static final PaymentProcessor paymentProcessor = new PaymentProcessor();
  private static final OrderService service = new OrderService();
  private static final InvoiceManager invoiceManager = new InvoiceManager();

  public static void main(String[] args) {
    // Create normal order and save it
    Customer customer = new Customer("Alice", "alice@example.com");
    service.processOrder(customer, 250.0);

    invoiceManager.createInvoice(customer.getName(), 250.0);
    paymentProcessor.process("credit", 250.0);

    // Create different orders for different type of customers
    Customer normal = new Customer("Ana", "ana@example.com");
    Customer premium = new PremiumCustomer("Luis", "luis@example.com");

    service.processOrder(normal, 200.0);
    paymentProcessor.process("paypal", 200.0);

    service.processOrder(premium, 300.0);
    paymentProcessor.process("bitcoin", 300.0);
  }
}
