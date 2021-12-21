package TP_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cantante> cantantes = new ArrayList();
        Cantante c = new Cantante();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean band = true;
        
        cantantes.add(c.crearCantante("Soda Stereo","Tratame Suavemente"));
        cantantes.add(c.crearCantante("Charly Garcia","Demoliendo Hoteles"));
        cantantes.add(c.crearCantante("Vilma Palma","Auto rojo"));
        cantantes.add(c.crearCantante("Abuelos de la nada","Costumbre Argentina"));
        cantantes.add(c.crearCantante("Los enanitos verdes","Tu carcel"));
        
        for (Cantante aux : cantantes) {
            System.out.println(aux);
        }
        
        do{
            System.out.println("1. agregar cantante\n2. Mostrar Cantante\n3. Actualizar cantante\n4. Eliminar cantante\n5. Salir");
            int resp = leer.nextInt();
            
            switch(resp){
                case 1:
                        System.out.println("Ingrese el nombre del cantante");
                        c.setNombre(leer.next());
                        System.out.println("Ingrese el dico más vendido");
                        c.setDiscoVendido(leer.next());
                        cantantes.add(c);
                    break;
                case 2:
                    for (Cantante aux: cantantes){
                        System.out.println(aux);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la posicion para actualizar");
                    int codigoA = leer.nextInt();
                    System.out.println("Ingrese el nombre sel cantante");
                    String cantante = leer.next();
                    System.out.println("Ingrese el disco más vendido");
                    String discoV = leer.next();
                    cantantes.set(codigoA, new Cantante(cantante, discoV));
                    break;
                case 4:
                    System.out.println("Ingrese la posición a eliminar");
                    int codigoE = leer.nextInt();
                        cantantes.remove(codigoE);
                        System.out.println("Se elimino");
                    break;
                case 5:
                    System.out.println("Salio del programa");
                    band = false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }while(band);
        
    }
}
