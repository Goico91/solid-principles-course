package cohesion.wrong;

class Pedido {
  private final String clienteEmail;
  private final double subtotal;

  public Pedido(String clienteEmail, double subtotal) {
    this.clienteEmail = clienteEmail;
    this.subtotal = subtotal;
  }

  public String getClienteEmail() {
    return clienteEmail;
  }

  public double getSubtotal() {
    return subtotal;
  }
}

class PedidoService {
  public void procesarPedido(Pedido pedido) {
    // Validación
    if (pedido.getClienteEmail() == null) {
      throw new IllegalArgumentException("Falta email del cliente");
    }

    // Cálculo total
    double total = pedido.getSubtotal() * 1.21;

    // Guardar pedido
    System.out.println("Guardando pedido con total: " + total);

    // Notificación
    EmailService emailService = new EmailService();
    emailService.enviarConfirmacion(pedido);
  }
}

class EmailService {
  public void enviarConfirmacion(Pedido pedido) {
    System.out.println("Enviando email a " + pedido.getClienteEmail());
  }
}

public class ApplicationCouplingAndCohesion {
  public static void main(String[] args) {
    Pedido pedido = new Pedido("cliente@ejemplo.com", 100.0);
    PedidoService service = new PedidoService();
    service.procesarPedido(pedido);
  }
}
