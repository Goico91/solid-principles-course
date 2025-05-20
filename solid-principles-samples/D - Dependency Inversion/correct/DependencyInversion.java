package correct;

record Customer(String name, String email) {}

record Order(Customer customer, double amount) {}

interface OrderRepository {
  void save(Order order);
}

class MySQLOrderRepository implements OrderRepository {
  public void save(Order order) {
    System.out.println("Guardando pedido en MySQL");
  }
}

class OrderService {
  private final OrderRepository repository;

  public OrderService(OrderRepository repository) {
    this.repository = repository;
  }

  public void saveOrder(Order order) {
    repository.save(order);
  }
}

public class DependencyInversion {
  public static void main(String[] args) {
    Customer customer = new Customer("Goico", "goico@email.com");
    Order order = new Order(customer, 10);

    OrderRepository orderRepository = new MySQLOrderRepository();
    OrderService orderService = new OrderService(orderRepository);
    orderService.saveOrder(order);
  }
}
