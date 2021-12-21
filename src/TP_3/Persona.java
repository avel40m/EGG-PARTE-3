package TP_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private ArrayList<Integer> notas = new ArrayList();

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    private Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona p = new Persona();
        System.out.println("Ingrese el nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese las 3 notas");
        for (int i = 0; i < 3; i++) {
            p.getNotas().add(leer.nextInt());
        }
        return p;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
    
    
}
