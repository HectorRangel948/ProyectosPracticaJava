import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        while(true){
            mostrarMenu();
            try {
                System.out.println("La operacion a realizar es: ");
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las opciones seleccionadas
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Seleccione una opcion valida");
                }
                //Imprimimos un salto de linea antes de repetir el ciclo
                System.out.println();
            }//fin try
            catch(Exception e){
                System.out.println("Ocurrio un error "+e);
            }
        }//Fin de while
    }//Fin de main

    private static void mostrarMenu(){
        System.out.println("****Aplicacion Calculadora****");
        System.out.println("""
                1.Suma
                2.Resta
                3.Multiplicacion
                4.Division
                5.Salida
                """);
    }
    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Proporciona el valor operando1: ");
        var operando1 = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona el valor operando2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("El resultado de la suma es " + resultado);
            }

            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("El resultado de la resta es " + resultado);
            }

            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("El resultado de la multiplicacion es " + resultado);
            }

            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("El resultado de la division es " + resultado);
            }

            default -> System.out.println("No se encontro la opcion " + operacion);
        }
    }
}//Fin de clase
