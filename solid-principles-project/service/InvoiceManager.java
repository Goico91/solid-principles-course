package service;

public class InvoiceManager {
  public void createInvoice(String customerName, double amount) {
    String invoice = "Invoice for " + customerName + ": " + amount + "€";
    System.out.println("Saving invoice: " + invoice);
    System.out.println("Sending invoice to: " + customerName + "@example.com");
  }
}
