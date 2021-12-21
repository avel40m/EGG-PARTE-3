package TP_9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> ciudades = new HashMap();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean band = false;

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el codigo postal");
            int codigo = leer.nextInt();
            System.out.println("Ingrese el nombre de la ciudad");
            String nombre = leer.next();
            ciudades.put(codigo, nombre);
        }

        for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Codigo de la ciudad: " + key + ", Ciudad: " + value);
        }

        System.out.println("\nIngrese el codigo de la ciudad a buscar");
        int buscar = leer.nextInt();

        for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            if (key == buscar) {
                System.out.println("La ciudad es: " + value);
                band = true;
                break;
            }
        }

        if (band == false) {
            System.out.println("No se encpontro la ciudad con ese codigo");
        }
        System.out.println("\nAgregar una ciudad más al listado");
        System.out.println("Ingrese el codigo");
        int codigoNuevo = leer.nextInt();
        System.out.println("Ingrese el nombre de la ciudad");
        String nombreNuevo = leer.next();
        ciudades.put(codigoNuevo, nombreNuevo);

        System.out.println("\nListado actualizado");
        for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Codigo de la ciudad: " + key + ", Ciudad: " + value);
        }

        System.out.println("\nEliminar 3 ciudades");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresar el codigo de la ciudad a eliminar");
            int codigoE = leer.nextInt();
            ciudades.remove(codigoE);
        }

        System.out.println("\nListado actualizado");
        for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Codigo de la ciudad: " + key + ", Ciudad: " + value);
        }
    }

}
