import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Convertir tipo string a tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad+1));

        var valorPi = Double.parseDouble("3.1416");
        System.out.println("Valor Pi = "+valorPi);

        var consola = new Scanner(System.in);
        /*System.out.println("Ingrese su edad:");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("Su edad es: "+edad);*/

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto "+edadTexto);

        var caracter = "hola".charAt(0);
        System.out.println("caracter "+caracter);

        System.out.println("proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter "+caracter);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        var hola=0;
    }
}