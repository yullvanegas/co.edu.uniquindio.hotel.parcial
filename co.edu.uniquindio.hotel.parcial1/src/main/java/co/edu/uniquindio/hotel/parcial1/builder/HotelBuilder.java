package co.edu.uniquindio.hotel.parcial1.builder;

import co.edu.uniquindio.hotel.parcial1.model.Cliente;
import co.edu.uniquindio.hotel.parcial1.model.Habitacion;
import co.edu.uniquindio.hotel.parcial1.model.Hotel;
import co.edu.uniquindio.hotel.parcial1.model.Reserva;

import java.util.ArrayList;
import java.util.List;

public class HotelBuilder {
    private String nombre;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();
    private List<Habitacion> habitaciones = new ArrayList<>();

    public HotelBuilder nombre(String nombre){
        this.nombre=nombre;
        return this;
    }
    public HotelBuilder clientes(Cliente cliente){
        this.clientes.add(cliente);
        return this;
    }
    public HotelBuilder reservsas(Reserva reserva){
        this.reservas.add(reserva);
        return this;
    }
    public HotelBuilder habitaciones(Habitacion habitacion){
        this.habitaciones.add(habitacion);
        return this;
    }

    public Hotel build() {
        return new Hotel(nombre);
    }
}
