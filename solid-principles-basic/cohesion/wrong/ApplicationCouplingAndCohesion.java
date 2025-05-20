package cohesion.wrong;

record Pedido(String clienteEmail, double subtotal) {}

class PedidoService {
  public void procesarPedido(Pedido pedido) {
    // Validación
    if (pedido.clienteEmail() == null) {
      throw new IllegalArgumentException("Falta email del cliente");
    }

    // Cálculo total
    double total = pedido.subtotal() * 1.21;

    // Guardar pedido
    System.out.println("Guardando pedido con total: " + total);

    // Notificación
    EmailService emailService = new EmailService();
    emailService.enviarConfirmacion(pedido);
  }
}

class EmailService {
  public void enviarConfirmacion(Pedido pedido) {
    System.out.println("Enviando email a " + pedido.clienteEmail());
  }
}

public class ApplicationCouplingAndCohesion {
  public static void main(String[] args) {
    Pedido pedido = new Pedido("cliente@ejemplo.com", 100.0);
    PedidoService service = new PedidoService();
    service.procesarPedido(pedido);
  }
}
