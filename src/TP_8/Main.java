package TP_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {        
        boolean band = true;
        HashSet<Libro> libros = new HashSet();
        Libro l = new Libro();

        do {
            System.out.println("----Menu Principal----");
            System.out.println("1. Crear libro\n2. Prestamo\n3. Ver libros\n4. Devolución\n5. Salir");
            int resp = leer.nextInt();

            switch (resp) {
                case 1:
                    Libro libro = l.crearLibro();
                    libros.add(libro);
                    break;
                case 2:
                    prestamo(libros);
                    break;
                case 3:
                    verLibros(libros);
                    break;
                case 4:
                    devolucion(libros);
                    break;
                case 5:
                    System.out.println("Salio del programa");
                    band = false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (band);
    }
    
    public static void prestamo(HashSet<Libro> libros){
        System.out.println("Ingrese el titulo del libro");
        String titulo = leer.next();
        
        Iterator<Libro> it = libros.iterator();
        
        while (it.hasNext()) {
            Libro next = it.next();
            if (next.getTitulo().equals(titulo)) {
                next.setNumeroEjemplarPrestado(next.getNumeroEjemplarPrestado()+ 1);
                System.out.println("Se presto el libro");
                break;
            }
        }
    }
    
    public static void verLibros(HashSet<Libro> libros){
        for (Libro aux : libros) {
            System.out.println(aux);
        }
    }
    
    public static void devolucion(HashSet<Libro> libros){
        System.out.println("Ingrese el titulo del libro a devolver");
        String titulo = leer.next();
        boolean band = false;
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            Libro next = it.next();
            if(next.getTitulo().equals(titulo) && next.getNumeroEjemplarPrestado() != 0){
                next.setNumeroEjemplarPrestado(next.getNumeroEjemplarPrestado()-1);
                System.out.println("Se devolvio el libro");
                band = true;
                break;
            }
        }
        
        if(band == false)
            System.out.println("No se pudo realizar la operación");
    }

}
