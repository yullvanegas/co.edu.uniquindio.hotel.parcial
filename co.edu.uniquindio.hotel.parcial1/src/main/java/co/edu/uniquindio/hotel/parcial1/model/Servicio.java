package co.edu.uniquindio.hotel.parcial1.model;

import co.edu.uniquindio.hotel.parcial1.services.IConsumible;

public class Servicio implements IConsumible {
    private String nombre;
    private int precio;

    public Servicio(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void consumir() {
        // Implementar la lógica de consumo aquí
        System.out.println("El servicio " + getNombre() + " ha sido consumido.");
    }
}
