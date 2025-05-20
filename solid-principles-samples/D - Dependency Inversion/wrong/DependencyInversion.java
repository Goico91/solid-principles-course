package wrong;

record Customer(String name, String email) {}

record Order(Customer customer, double amount) {}

class MySQLOrderRepository {
  public void save(Order order) {
    System.out.println("Order from customer: " + order.customer().name() + " saved correctly");
  }
}

class OrderService {
  private final MySQLOrderRepository repository = new MySQLOrderRepository();

  public void saveOrder(Order order) {
    repository.save(order);
  }
}

public class DependencyInversion {
  public static void main(String[] args) {
    Customer customer = new Customer("Goico", "goico@email.com");
    Order order = new Order(customer, 10);

    OrderService orderService = new OrderService();
    orderService.saveOrder(order);
  }
}
