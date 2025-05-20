package cohesion.correct;

record Pedido(String clienteEmail, double subtotal) {}

interface Notificador {
  void notificar(Pedido pedido);
}

class EmailNotificador implements Notificador {
  @Override
  public void notificar(Pedido pedido) {
    System.out.println("Enviando email a " + pedido.clienteEmail());
  }
}

class ValidadorPedido {
  public void validar(Pedido pedido) {
    if (pedido.clienteEmail() == null) {
      throw new IllegalArgumentException("Falta email del cliente");
    }
  }
}

class CalculadoraTotal {
  public double calcularTotal(Pedido pedido) {
    return pedido.subtotal() * 1.21;
  }
}

class RepositorioPedido {
  public void guardar(Pedido pedido, double total) {
    System.out.println("Guardando pedido con total: " + total);
  }
}

class PedidoService {
  private final ValidadorPedido validador;
  private final CalculadoraTotal calculadora;
  private final RepositorioPedido repositorio;
  private final Notificador notificador;

  public PedidoService(
      ValidadorPedido validador,
      CalculadoraTotal calculadora,
      RepositorioPedido repositorio,
      Notificador notificador) {
    this.validador = validador;
    this.calculadora = calculadora;
    this.repositorio = repositorio;
    this.notificador = notificador;
  }

  public void procesarPedido(Pedido pedido) {
    validador.validar(pedido);
    double total = calculadora.calcularTotal(pedido);
    repositorio.guardar(pedido, total);
    notificador.notificar(pedido);
  }
}

public class ApplicationCouplingAndCohesion {
  public static void main(String[] args) {
    Pedido pedido = new Pedido("cliente@ejemplo.com", 100.0);

    ValidadorPedido validador = new ValidadorPedido();
    CalculadoraTotal calculadora = new CalculadoraTotal();
    RepositorioPedido repositorio = new RepositorioPedido();
    Notificador notificador = new EmailNotificador();

    PedidoService servicio = new PedidoService(validador, calculadora, repositorio, notificador);
    servicio.procesarPedido(pedido);
  }
}
