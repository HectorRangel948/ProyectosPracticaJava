package servicio;

import dominio.Pelicula;

import java.io.*;

public class ServicioPeliculasArchivo implements IServicioPeliculas {

    private final String NOMBRE_ARCHIVO = "peliculas.txt";


    public ServicioPeliculasArchivo(){
        var archivo = new File(NOMBRE_ARCHIVO);

        try{
            //Si ya existe el archivo no se vuelve a crear
            if(archivo.exists()){
                System.out.println("El archivo ya existe");
            }
            else{
                //Si no existe se crea vacío
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();//Si no se cierra el archivo no se guarda en el disco duro
                System.out.println("Se ha creado el archivo");
            }

        }catch(Exception e){
            System.out.println("Ocurrió un error al abrir el archivo: " + e);
        }
    }


    @Override
    public void listarPeliculas() {
        //Volvemos a abrir el archivo
        var archivo = new File(NOMBRE_ARCHIVO);
        try{
            System.out.println("Listado de películas");
            //Abrimos el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            //Leemos linea a linea el archivo
            String linea;
            linea=entrada.readLine();
            //Leemos todas la lineas
            while (linea!=null) {
                var pelicula = new Pelicula(linea);
                System.out.println(pelicula);
                //Antes de terminar el ciclo volvemos a leer la siguiente linea
                linea=entrada.readLine();
            }

            //Cerrar el archivo
            entrada.close();

        }catch(Exception e){
            System.out.println("Ocurrió un error al leer el archivo: "+e.getMessage());
        }
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try{
            //Revisamos si existe el archivo
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            // Agregar la pelicula (toString)
            salida.println(pelicula);
            salida.close();
            System.out.println("Se agregó al archivo: " + pelicula);
        }catch(Exception e){
            System.out.println("Ocurrió un error al agregar pelicula: "+e.getMessage());
        }
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        var archivo = new File(NOMBRE_ARCHIVO);
        try{
            //Abrimos el archivo para lectura linea a linea
            var entrada = new BufferedReader(new FileReader(archivo));
            String lineaTexto;
            lineaTexto= entrada.readLine();
            var indice =1;
            var encontrada = false;
            var peliculaBuscar = pelicula.getNombre();

            while(lineaTexto!=null){
                //Buscamos sin imoportar mayusculas/minusculas
                if(peliculaBuscar!=null&&peliculaBuscar.equalsIgnoreCase(lineaTexto)){
                    encontrada=true;
                    break;
                }
                //Leemos la siguiente linea antras de la siguiente iteración
                lineaTexto = entrada.readLine();
                indice++;
            }//termina while

            //Imprimimos los resultados de la búsquda
            if(encontrada==true){
                System.out.println("Pelicula " + lineaTexto + " encontrada - linea " + indice);
            }
            else{
                System.out.println("No se encontró la película: " + pelicula.getNombre());
            }

            entrada.close();

        }catch(Exception e){
            System.out.println("Ocurrió un error al buscar la película: " + e.getMessage());
        }

    }
}
