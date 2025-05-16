package repository;

import model.Order;

public class OrderRepository {
  public void save(Order order) {
    System.out.println("Order saved: " + order.getAmount());
  }
}
