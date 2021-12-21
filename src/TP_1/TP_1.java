
package TP_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class TP_1 {

    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList();
        Scanner leer = new Scanner(System.in);
        boolean band = true;int cont = 0;
        
        do {            
            System.out.println("Ingrese la raza del perro");
            String raza = leer.next();
//            Capitalizar la letra
            raza = raza.substring(0, 1).toUpperCase()+raza.substring(1);
            razas.add(raza);     
            
            System.out.println("¿Desea crear otra raza de perro? (si - no)");
            String resp = leer.next();
            resp = resp.toLowerCase();
            
            if(resp.equals("no"))
                band = false;
        } while (band);
        int cantidad = razas.size();
        
        System.out.println("Listado de razas");
        
        for (String raza : razas) {
            System.out.println(raza);
        }
        System.out.println("Ingrese la raza a eliminar");        
        String buscar = leer.next();
        buscar = buscar.substring(0, 1).toUpperCase()+buscar.substring(1);
        
        Iterator<String> raza = razas.iterator();
        
        while(raza.hasNext()){
            String it = raza.next();
            if(it.equals(buscar)){
                System.out.println("La raza fue eliminada");
                raza.remove();
                break;
            }
        }
        
        
        if(razas.size() == cantidad )
            System.out.println("No se encontro la raza");
              
        Collections.sort(razas);
        System.out.println("La lista ordenada que de la siguiente manera:");
        for (String r : razas) {
            System.out.println(r.toString());
        }
    }
    
}
