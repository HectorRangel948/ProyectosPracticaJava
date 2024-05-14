import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ListadoPersonasApp {
    public static void main(String[] args) {
         Scanner consola = new Scanner(System.in);
         //Definir la lista fuera del ciclo while
         List<Persona> personas = new ArrayList<>();

         //Empezamos con el menú
         var salir = false;
         while(!salir){
             mostrarMenu();
             try{
                 salir=ejecutarOperacion(consola, personas);
             }
             catch(Exception e){
                 System.out.println("Ocurrió un error " +e.getMessage());

             }
             System.out.println();

         }
        }

        private static void mostrarMenu(){
            System.out.print("""
                    ****Listado Personas App****
                    1.- Agregar
                    2.- Listar
                    3.- Salir
                    """);

            System.out.print("Selecciona una opción ");

        }

        private static boolean ejecutarOperacion(Scanner consola, List<Persona>personas){
            var opcion = Integer.parseInt(consola.nextLine());
            var salir = false;
            //Revisamos la opción proporcionada
            switch(opcion){
                case 1->{
                    //Agregar persona a la lista
                    System.out.println("Proporciona el nombre");
                    var nombre = consola.nextLine();
                    System.out.println("Proporciona el teléfono");
                    var telefono = consola.nextLine();
                    System.out.println("Proporciona el email");
                    var email = consola.nextLine();

                    //Crear objeto tipo persona
                    var persona = new Persona(nombre, telefono, email);
                    //Lo agregamos a la lista
                    personas.add(persona);
                    System.out.println("La lista tiene: " + personas.size() + " elementos");
                } //Fin del caso 1

                case 2 ->{ //Listar las personas
                    System.out.println("Listado de personas ");
                    //Mejora usando función lambda y método de referencia
                    //personas.forEach((persona)->System.out.println(persona));

                    //Mejora con método de referencia
                    personas.forEach(System.out::println);
                }

                case 3 ->{ //Salimos del ciclo
                    System.out.println("Hasta pronto...");
                    salir=true;
                }

                default ->{
                    System.out.println("Opción erronea "+opcion);
                }
            }//Fin de switch
            return salir;

        }
}