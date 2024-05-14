import java.util.Scanner;

public class TiendaDeLibros {
    public static void main(String[] args) {
        String nombre = "";
        int id=0;
        double precio=0.0;
        boolean envioGratuito=false;
        var consola = new Scanner(System.in);

        System.out.println("Proporciona el nombre:");
        nombre=consola.nextLine();
        System.out.println("Proporciona el Id: ");
        id=Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio: ");
        precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito: ");
        envioGratuito=Boolean.parseBoolean(consola.nextLine());

        System.out.println("Nombre: " + nombre + "\n" + "ID: " + id + "\n" + "Precio: " + precio + "\n" + "Envio gratuito: " + envioGratuito );
    }
}
