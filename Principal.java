import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    System.out.println("Hola Mundo");
    mostrarFechaHora();
    Usuario[] usuarios = crearUsuarios(3);
    for (Usuario usuario : usuarios) {
      System.out.println(usuario);
    }
  }

  public static void mostrarFechaHora() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    LocalDateTime now = LocalDateTime.now();  
    System.out.println("Fecha y hora actual: " + dtf.format(now));  
  }

  public static Usuario[] crearUsuarios(int numUsuarios) {
    Scanner scanner = new Scanner(System.in);
    Usuario[] usuarios = new Usuario[numUsuarios];
    for (int i = 0; i < numUsuarios; i++) {
      System.out.println("Introduce el nombre del usuario " + (i + 1) + ":");
      String nombre = scanner.nextLine();
      System.out.println("Introduce los apellidos del usuario " + (i + 1) + ":");
      String apellidos = scanner.nextLine();
      System.out.println("Introduce el email del usuario " + (i + 1) + ":");
      String email = scanner.nextLine();
      usuarios[i] = new Usuario(nombre, apellidos, email);
    }
    return usuarios;
  }
}
