package TP_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer,String> productos = new HashMap();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean band = true;
        
        do {            
            System.out.println("1. Crear producto\n2. Ver lista\n3. Actualizar\n4. Eliminar producto\n5. Salir");
            int resp = leer.nextInt();
            
            switch(resp){
                case 1:
                    System.out.println("Ingrese codigo del producto");
                    int codigo = leer.nextInt();
                    System.out.println("Ingrese el nombre del producto");
                    String nombre = leer.next();
                    productos.put(codigo, nombre);
                    break;
                case 2:
                    System.out.println("----Listado de producto----");
                    for (Map.Entry<Integer, String> entry : productos.entrySet()) {
                        Integer key = entry.getKey();
                        String value = entry.getValue();
                        System.out.println("Codigo: "+key+", Nombre: "+value);
                    }
                    break;
                case 3:
                    System.out.println("----Actualizar producto----");
                    System.out.println("Ingrese el codigo");
                    int modificarCodigo = leer.nextInt();
                    System.out.println("Ingrese el nombre a actualizar");
                    String nombreA = leer.next();
                    productos.put(modificarCodigo, nombreA);
                    break;
                case 4:
                    System.out.println("----Eliminar Producto----");
                    System.out.println("Ingrese el codigo de producto");
                    int codigoE = leer.nextInt();
                    productos.remove(codigoE);
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
    
}
