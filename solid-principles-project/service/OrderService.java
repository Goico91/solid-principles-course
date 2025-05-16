package service;

import model.Customer;
import model.Order;

public class OrderService {
  public void processOrder(Customer customer, double amount) {
    Order order = new Order(customer, amount);

    // Business logic, persistence and notification all here
    System.out.println("Validating order...");
    System.out.println("Saving order: " + order.getAmount());
    System.out.println("Sending confirmation to " + customer.getEmail());
  }
}
