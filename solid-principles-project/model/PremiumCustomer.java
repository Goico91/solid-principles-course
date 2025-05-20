package model;

public class PremiumCustomer extends Customer {
  public PremiumCustomer(String name, String email) {
    super(name, email);
  }

  @Override
  public double getDiscountRate() {
    return 0.10;
  }
}
