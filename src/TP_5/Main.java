package TP_5;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Pais p = new Pais();
        Scanner leer = new Scanner(System.in);
        TreeSet<Pais> paises = new TreeSet();
        boolean band = true;
        
        do {            
            Pais pais = p.crearPais();
            paises.add(pais);
            
            System.out.println("¿Desea agregar otro pais? si/no");
            String resp = leer.next();
            resp = resp.toLowerCase();
            if(resp.equals("no"))
                band = false;
        } while (band);
        
        System.out.println("----Listado de paises agregados----");
        for (Pais aux : paises) {
            System.out.println(aux);
        }
        int cantidad = paises.size();
        
        System.out.println("Ingrese el pais que quiera eliminar");
        String Buscar = leer.next();
        
        Iterator<Pais> it = paises.iterator();
        
        while (it.hasNext()) {
            Pais next = it.next();
            if(next.getNombre().equals(Buscar)){
                System.out.println("El pais "+next.getNombre()+" se elimino correctamente");
                it.remove();
                break;
            }
        }
        if(cantidad == paises.size())
            System.out.println("No se encontro el pais");
        System.out.println("----Lista de paises actual----");
        for (Pais aux : paises) {
            System.out.println(aux);
        }
    }
    
}
