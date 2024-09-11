package co.edu.uniquindio.hotel.parcial1.model;

import co.edu.uniquindio.hotel.parcial1.builder.HabitacionBuilder;
import co.edu.uniquindio.hotel.parcial1.services.IHabitacionCrud;

public class Habitacion implements IHabitacionCrud {
    private int numero;
    private int precio;
    private Servicio servicio;


    public Habitacion(int numero, int precio, Servicio servicio){
        this.numero= numero;
        this.precio= precio;
        this.servicio = servicio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public static HabitacionBuilder builder(){
        return new HabitacionBuilder();
    }

    @Override
    public boolean crearHabitacion(int numero, int precio) {
        return false;
    }

    @Override
    public boolean eliminarHabitacion(int numero) {
        return false;
    }

    @Override
    public boolean updateHabitacion(int numero, int precioActual, int precioNuevo) {
        return false;
    }

    @Override
    public String obtenerDatosHabitacion(int numero) {
        return toString();
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", precio=" + precio +
                ", servicio=" + servicio +
                '}';
    }
}
