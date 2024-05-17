package servicio;

import dominio.Pelicula;

import java.util.List;

import java.util.ArrayList;

public class ServicioPeliculasLista implements IServicioPeliculas{

    private final List<Pelicula> peliculas;

    public ServicioPeliculasLista(){
        this.peliculas = new ArrayList<>();
    }
    @Override
    public void listarPeliculas() {
        System.out.println("Listado de peliculas...");
        peliculas.forEach(System.out::println);

    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Se agregó la película: "+pelicula);

    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        // Regresa el índice de la película encontrada en la lista
        var indice = peliculas.indexOf(pelicula);
        if (indice==-1){
            System.out.println("La película no existe en el listado");
        }
        else{
            System.out.println("Película encontrada en el índice: " + indice);
        }
    }

    public static void main(String[] args){
        //Creamos algunos objetos de tipo película
        var pelicula1 = new Pelicula("Batman");
        var pelicula2= new Pelicula("Superman");
        //Creamos el servicio (patrón de diseño service)
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();
        //Agregamos las películas a la lista
        servicioPeliculas.agregarPelicula(pelicula1);
        servicioPeliculas.agregarPelicula(pelicula2);

        //Listamos las películas
        servicioPeliculas.listarPeliculas();

        //Buscar películas
        //Se debe de implementar el método equals y hashCode

        servicioPeliculas.buscarPelicula(new Pelicula("Spiderman"));
    }
}
