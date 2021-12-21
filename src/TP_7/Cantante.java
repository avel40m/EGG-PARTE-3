package TP_7;

public class Cantante {
    private String nombre;
    private String discoVendido;

    public Cantante() {
    }

    public Cantante(String nombre, String discoVendido) {
        this.nombre = nombre;
        this.discoVendido = discoVendido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoVendido() {
        return discoVendido;
    }

    public void setDiscoVendido(String discoVendido) {
        this.discoVendido = discoVendido;
    }

    @Override
    public String toString() {
        return "Cantante: " + nombre + ", Disco con más ventas: " + discoVendido;
    }
    
    public Cantante crearCantante(String nombre,String discoVendido){
        return new Cantante(nombre, discoVendido);
    }
}
