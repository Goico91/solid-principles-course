package poo;

// Clase base
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

// Herencia
class Coche extends Vehiculo {
  public Coche(String marca) {
    super(marca);
  }

  public void tocarClaxon() {
    System.out.println("¡Beep beep!");
  }
}

class Moto extends Vehiculo {
  public Moto(String marca) {
    super(marca);
  }

  public void hacerCaballito() {
    System.out.println("¡Mira cómo levanto la rueda!");
  }
}

// Polimorfismo
class Taller {
  public void probarVehiculo(Vehiculo v) {
    v.acelerar();
    v.frenar();
  }
}

public class ApplicationPOOBasic {
  public static void main(String[] args) {
    Vehiculo miCoche = new Coche("Toyota");
    Vehiculo miMoto = new Moto("Yamaha");

    Taller taller = new Taller();
    taller.probarVehiculo(miCoche);
    taller.probarVehiculo(miMoto);
  }
}
