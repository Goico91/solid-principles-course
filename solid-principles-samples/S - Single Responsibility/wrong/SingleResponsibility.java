package wrong;

class ReportService {
  public void generateAndPrintReport() {
    String report = "Este es el informe generado por el sistema.";
    System.out.println("Imprimiendo informe...");
    System.out.println(report);
  }
}

public class SingleResponsibility {
  public static void main(String[] args) {
    ReportService service = new ReportService();
    service.generateAndPrintReport();
  }
}
