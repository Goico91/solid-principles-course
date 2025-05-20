package service;

import model.Customer;
import model.Order;
import model.PremiumCustomer;
import repository.OrderSQLRepository;

public class OrderService {
  private final OrderSQLRepository repository = new OrderSQLRepository();

  public void processOrder(Customer customer, double amount) {
    Order order = new Order(customer, amount);

    System.out.println("Validating order...");
    System.out.println("Saving order: " + order.amount());
    repository.save(order);

    if (customer instanceof PremiumCustomer premiumCustomer) {
      double discount = premiumCustomer.getDiscountRate();
      System.out.println("Order total: " + (amount * (1 - discount)));
    } else {
      System.out.println("Order total: " + amount);
    }

    System.out.println("Sending confirmation to " + customer.getEmail());
  }
}
