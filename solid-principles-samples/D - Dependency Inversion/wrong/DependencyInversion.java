package wrong;

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

class MySQLOrderRepository {
  public void save(Order order) {
    System.out.println(
        "Order from customer: " + order.getCustomer().getName() + " saved correctly");
  }
}

class OrderService {
  private MySQLOrderRepository repository = new MySQLOrderRepository();

  public void saveOrder(Order order) {
    repository.save(order);
  }
}

public class DependencyInversion {
  public static void main(String[] args) {}
}
