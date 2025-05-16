package correct;

class ReportGenerator {
  public String generateReport() {
    return "Este es el informe generado por el sistema.";
  }
}

class ReportPrinter {
  public void print(String report) {
    System.out.println("Imprimiendo informe...");
    System.out.println(report);
  }
}

public class SingleResponsibility {
  public static void main(String[] args) {
    ReportGenerator generator = new ReportGenerator();
    ReportPrinter printer = new ReportPrinter();

    String report = generator.generateReport();
    printer.print(report);
  }
}
