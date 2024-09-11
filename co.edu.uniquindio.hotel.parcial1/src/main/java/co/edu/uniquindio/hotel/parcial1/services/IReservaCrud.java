package co.edu.uniquindio.hotel.parcial1.services;

import co.edu.uniquindio.hotel.parcial1.model.Cliente;
import co.edu.uniquindio.hotel.parcial1.model.Habitacion;

import java.time.LocalDate;

public interface IReservaCrud {
    boolean crearReserva(LocalDate fechaEntrada, LocalDate fechaSalida, Cliente cliente, Habitacion habitacion);
    boolean eliminarReserva(Habitacion habitacion);
    String obtenerDatosReserva(LocalDate fechaEntrada);

}
