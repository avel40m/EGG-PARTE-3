package TP_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList();
        boolean band = true; int sumar = 0;
        
        System.out.println("Crear alumno");
        do {
            Persona p = new Persona();
            personas.add(p.crearPersona());

            System.out.println("¿Desea agregar otro alumno? - si/no");
            String resp = leer.next().toLowerCase();

            if (resp.equals("no")) {
                band = false;
            }
        } while (band);
        
        System.out.println("Ingrese el nombre del alumno");
        String resp = leer.next();
        
        Iterator<Persona> per = personas.iterator();
        
        while(per.hasNext()){
            Persona p = per.next();
            if(p.getNombre().equals(resp)){
                for (int i = 0; i < p.getNotas().size(); i++) {
                    sumar += p.getNotas().get(i);
                }
            }
        }
        
        System.out.println("El promedio del alumno es: " + (double) (sumar / personas.get(0).getNotas().size()));
    }

}
