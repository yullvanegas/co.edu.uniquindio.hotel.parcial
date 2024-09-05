package co.edu.uniquindio.hotel.parcial1.model;

import java.time.LocalDate;

public class Reserva {
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Cliente cliente;
    private  Habitacion habitacion;

    public Reserva(LocalDate fechaEntrada, LocalDate fechaSalida, Cliente cliente, Habitacion habitacion) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                ", cliente=" + cliente +
                ", habitacion=" + habitacion +
                '}';
    }
}
