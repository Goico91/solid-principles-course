package repository;

import model.Order;

public class OrderSQLRepository implements OrderRepository {
  @Override
  public void connect() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void save(Order order) {
    System.out.println("Order saved: " + order.amount());
  }

  @Override
  public void commit() {
    throw new UnsupportedOperationException();
  }
}
