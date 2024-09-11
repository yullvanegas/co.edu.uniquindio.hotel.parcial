package co.edu.uniquindio.hotel.parcial1.model;

import co.edu.uniquindio.hotel.parcial1.builder.ReservaBuilder;
import co.edu.uniquindio.hotel.parcial1.builder.ServicioBuilder;
import co.edu.uniquindio.hotel.parcial1.services.IConsumible;
import co.edu.uniquindio.hotel.parcial1.services.IServicioCrud;

public class Servicio implements IConsumible, IServicioCrud {
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
    public static ServicioBuilder builder(){
        return new ServicioBuilder();
    }

    @Override
    public void consumir() {
        // Implementar la lógica de consumo aquí
        System.out.println("El servicio " + getNombre() + " ha sido consumido.");
    }

    @Override
    public boolean crearServicio(String nombre, int precio) {
        return false;
    }

    @Override
    public boolean eliminarServicio(String nombre) {
        return false;
    }

    @Override
    public boolean updateServicio(String nombreActual, String nombreNuevo, int precioActual, int precioNuevo) {
        return false;
    }

    @Override
    public String obtenerDatosServicio(String nombre) {
        return "";
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
