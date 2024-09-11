package co.edu.uniquindio.hotel.parcial1.model;

import co.edu.uniquindio.hotel.parcial1.builder.ClienteBuilder;
import co.edu.uniquindio.hotel.parcial1.builder.ReservaBuilder;
import co.edu.uniquindio.hotel.parcial1.services.IClienteCrud;

public class Cliente implements IClienteCrud {
    private String nombre;
    private String id;
    private Reserva reserva;

    public Cliente(String nombre, String id, Reserva reserva){
        this.nombre= nombre;
        this.id= id;
        this.reserva= reserva;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }


    @Override
    public boolean crearCliente(String nombre, String id) {
        return false;
    }

    @Override
    public boolean eliminarCliente(String id) {
        return false;
    }

    @Override
    public boolean updateCliente(String nombre, String idActual, String idNuevo) {
        return false;
    }

    @Override
    public String obtenerDatosCliente(String id) {
        return toString();
    }
    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", reserva=" + reserva +
                '}';
    }
}
