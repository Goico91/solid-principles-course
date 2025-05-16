package notification;

import model.Order;

public class EmailSender {
  public void sendConfirmation(Order order) {
    System.out.println("Email sent to " + order.getCustomer().getEmail());
  }
}
