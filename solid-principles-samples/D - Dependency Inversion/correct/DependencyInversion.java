package correct;

class Customer {
  private final String name;
  private final String email;

  public Customer(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }
}

class Order {
  private final Customer customer;
  private final double amount;

  public Order(Customer customer, double amount) {
    this.customer = customer;
    this.amount = amount;
  }

  public Customer getCustomer() {
    return customer;
  }

  public double getAmount() {
    return amount;
  }
}

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
  public static void main(String[] args) {}
}
