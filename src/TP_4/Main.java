package TP_4;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Pelicula p = new Pelicula();
        Scanner leer = new Scanner(System.in);
        boolean band = true;
        System.out.println("----Menu Principal----\n");
        
        do {            
            System.out.println("1. Crear pelicula\n2. Mostrar pelicula\n"
                    + "3. Pelicula mayor a 1 minuto\n4. Orden de pelicula por duración\n"
                    + "5. Ordenar por titulo\n"
                    + "6. Ordenar por Director\n7. Salir");
            int n = leer.nextInt();
            
            switch(n){
                case 1:
                    p.crearPelicula();
                    break;
                case 2:
                    p.mostrarPelicula();
                    break;
                case 3:
                    p.mostrarPeliculaMayorMinuto();
                    break;
                case 4:
                    p.ordenarPorMinutoAsc();
                    break;
                case 5:
                    p.ordenarPorTituloAlf();
                    break;
                case 6:
                    p.ordenPorDirectorAlf();
                    break;
                case 7:
                    System.out.println("Salio del programa");
                    band = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, ingrese nuevamente opción");
                    break;
            }
        } while (band);
    }
    
}
