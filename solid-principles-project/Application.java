import model.Customer;
import service.OrderService;

public class Application {
  public static void main(String[] args) {
    Customer customer = new Customer("Alice", "alice@example.com");
    OrderService service = new OrderService();
    service.processOrder(customer, 250.0);
  }
}
