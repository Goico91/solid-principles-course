package model;

public class Customer {
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

  public double getDiscountRate() {
    return 0.0;
  }
}
