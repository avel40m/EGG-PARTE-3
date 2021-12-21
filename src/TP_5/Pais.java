package TP_5;

import java.util.Objects;
import java.util.Scanner;

public class Pais implements Comparable<Pais> {

    private String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais: " + nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nombre);
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
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Pais t) {
        return this.getNombre().compareTo(t.getNombre());
    }

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pais crearPais() {
        System.out.println("Ingresar el nombre del pais");
        return new Pais(leer.next());
    }

}
