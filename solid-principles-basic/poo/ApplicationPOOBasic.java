package poo;

/** =================================== Clase base =================================== */
class Vehiculo {
  private final String marca;
  private int velocidad;

  public Vehiculo(String marca) {
    this.marca = marca;
    this.velocidad = 0;
  }

  public void acelerar() {
    velocidad += 10;
    System.out.println(marca + " acelera a " + velocidad + " km/h");
  }

  public void frenar() {
    velocidad -= 10;
    System.out.println(marca + " frena a " + velocidad + " km/h");
  }

  public int getVelocidad() {
    return velocidad;
  }
}

/** =================================== Herencia =================================== */
class Coche extends Vehiculo {
  public Coche(String marca) {
    super(marca);
  }

  public void tocarClaxon() {
    System.out.println("Ruido de claxon hecho con la boca");
  }
}

class Moto extends Vehiculo {
  public Moto(String marca) {
    super(marca);
  }

  public void derrapar() {
    System.out.println("Haz un derrape chechu!");
  }
}

/** =================================== Polimorfismo =================================== */
class Taller {
  public void probarVehiculo(Vehiculo v) {
    v.acelerar();
    v.frenar();
  }
}

/** =================================== Main =================================== */
public class ApplicationPOOBasic {
  public static void main(String[] args) {
    // Clases
    Coche coche = new Coche("BMV");
    coche.tocarClaxon();
    Moto moto = new Moto("BMV");
    moto.derrapar();

    // Herencia
    Vehiculo toyota = new Coche("Toyota");
    Vehiculo yamaha = new Moto("Yamaha");

    // Polimorfismo
    Taller taller = new Taller();
    taller.probarVehiculo(toyota);
    taller.probarVehiculo(yamaha);
  }
}
