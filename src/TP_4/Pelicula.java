package TP_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Pelicula {
    private String titulo;
    private String director;
    private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Titulo: "+titulo+", Director: "+director+", Duración: "+duracion;
    }
    
    private ArrayList<Pelicula> peliculas = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPelicula(){
        System.out.println("----Crear pelicula----");
        Pelicula p = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula");
        p.setTitulo(leer.next());
        System.out.println("Ingrese el director de la pelicula");
        p.setDirector(leer.next());
        System.out.println("Ingrese la duración de la pelicula");
        p.setDuracion(leer.nextInt());
        peliculas.add(p);
    }
    
    public void mostrarPelicula(){
        System.out.println("\n ----Listado de peliculas----");
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
    
    public void mostrarPeliculaMayorMinuto(){
        System.out.println("\n----Peliculas mayor a 1 minuto----");
        for (Pelicula aux : peliculas) {
            if(aux.getDuracion() > 1){
                System.out.println(aux);
            }
        }
    }
    
    private Comparator<Pelicula> ordenarPorMinutoAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.duracion.compareTo(t.duracion);
        }
    };
    
    public void ordenarPorMinutoAsc(){
        Collections.sort(peliculas, ordenarPorMinutoAsc);
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
    
    private Comparator<Pelicula> ordenTituloFormaAlf = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
    public void ordenarPorTituloAlf(){
        Collections.sort(peliculas, ordenTituloFormaAlf);
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
    
    private Comparator<Pelicula> ordenDirectorFormaAlf = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
    
    public void ordenPorDirectorAlf(){
        Collections.sort(peliculas, ordenDirectorFormaAlf);
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
}
