package TP_8;

import java.util.Objects;
import java.util.Scanner;


public class Libro {
    private String titulo;
    private String autor;
    private int numeroEjemplar;
    private int numeroEjemplarPrestado;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroEjemplar, int numeroEjemplarPrestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplar = numeroEjemplar;
        this.numeroEjemplarPrestado = numeroEjemplarPrestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplar() {
        return numeroEjemplar;
    }

    public void setNumeroEjemplar(int numeroEjemplar) {
        this.numeroEjemplar = numeroEjemplar;
    }

    public int getNumeroEjemplarPrestado() {
        return numeroEjemplarPrestado;
    }

    public void setNumeroEjemplarPrestado(int numeroEjemplarPrestado) {
        if(getNumeroEjemplar() == getNumeroEjemplarPrestado())
            System.out.println("No se puede generara la operación, no existe ejemplar para prestar");
        else
            this.numeroEjemplarPrestado = numeroEjemplarPrestado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.titulo);
        hash = 67 * hash + Objects.hashCode(this.autor);
        hash = 67 * hash + this.numeroEjemplar;
        hash = 67 * hash + this.numeroEjemplarPrestado;
        hash = 67 * hash + Objects.hashCode(this.leer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.numeroEjemplar != other.numeroEjemplar) {
            return false;
        }
        if (this.numeroEjemplarPrestado != other.numeroEjemplarPrestado) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.leer, other.leer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numeroEjemplar=" + numeroEjemplar + ", numeroEjemplarPrestado=" + numeroEjemplarPrestado + '}';
    }
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Libro crearLibro(){
        Libro l = new Libro();
        System.out.println("Ingresar el titulo del libro");
        l.titulo = leer.next();
        System.out.println("Ingrese el autor del libro");
        l.autor = leer.next();
        System.out.println("Número de ejemplares");
        l.numeroEjemplar = leer.nextInt();
        System.out.println("Número de ejemplares prestados");
        l.numeroEjemplarPrestado = leer.nextInt();
        return l;
    }
    
    
}
