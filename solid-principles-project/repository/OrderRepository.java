package repository;

import model.Order;

public interface OrderRepository {
  void connect();

  void save(Order order);

  void commit();
}
