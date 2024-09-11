package co.edu.uniquindio.hotel.parcial1.factory;

import co.edu.uniquindio.hotel.parcial1.builder.ClienteBuilder;
import co.edu.uniquindio.hotel.parcial1.builder.ReservaBuilder;
import co.edu.uniquindio.hotel.parcial1.model.*;
import co.edu.uniquindio.hotel.parcial1.services.IClienteCrud;
import co.edu.uniquindio.hotel.parcial1.services.IHabitacionCrud;
import co.edu.uniquindio.hotel.parcial1.services.IReservaCrud;
import co.edu.uniquindio.hotel.parcial1.services.IServicioCrud;

import java.time.LocalDate;

public class ModelFactory implements IClienteCrud, IReservaCrud, IServicioCrud, IHabitacionCrud {
    private static ModelFactory modelFactory;
    private Hotel hotel;

    private ModelFactory(){
        inicializarDatos();
    }

    public static ModelFactory getInstance(){
        if(modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }
    public void mostrarClientes(String id) {
        hotel.mostrarClientes(id);
    }
    public void buscarReservas(LocalDate fechaEntrada) {
        hotel.buscarReservas(fechaEntrada);
    }
    private void inicializarDatos() {
        hotel = Hotel.builder().nombre("ejemplo").build();
        Cliente cliente1 = Cliente.builder()
                        .nombre("Juan")
                        .id("12345678A")
                        .build();
        Cliente cliente2 = Cliente.builder()
                        .nombre("Ana Gómez")
                        .id("87654321B")
                        .build();
        Habitacion habitacion1 = Habitacion.builder()
                        .numero(1)
                        .precio(50)
                        .build();
        Habitacion habitacion2 = Habitacion.builder()
                        .numero(2)
                        .precio(50)
                        .build();
        Habitacion habitacion3 = Habitacion.builder()
                        .numero(3)
                        .precio(50)
                        .build();
        Reserva reserva1 = Reserva.builder()
                        .fechaEntrada(LocalDate.of(2024, 10, 1))
                        .build();
        Reserva reserva2 = Reserva.builder()
                        .fechaEntrada(LocalDate.of(2024, 10, 1))
                        .fechaSalida(LocalDate.of(2024, 10, 1))
                        .cliente(cliente1)
                        .habitacion(habitacion1)
                        .build();
        Reserva reserva3 = Reserva.builder()
                        .fechaEntrada(LocalDate.of(2024, 11, 5))
                        .fechaSalida(LocalDate.of(2024, 11, 15))
                        .habitacion(habitacion2)
                        .build();
        Servicio servicio = Servicio.builder().nombre("desayuno").precio(50).build();
        Servicio servicio1 = Servicio.builder().nombre("toallas").precio(30).build();


        hotel.addCliente(cliente1);
        hotel.addCliente(cliente2);
        hotel.addReserva(reserva1);
        hotel.addReserva(reserva2);
        hotel.addReserva(reserva3);
        hotel.addHabitacion(habitacion1);
        hotel.addHabitacion(habitacion2);
        hotel.addHabitacion(habitacion3);
        hotel.addServicio(servicio);
        hotel.addServicio(servicio1);
    }


    @Override
    public boolean crearCliente(String nombre, String id) {

        return hotel.crearCliente(nombre, id);
    }

    @Override
    public boolean eliminarCliente(String id) {
        return hotel.eliminarCliente(id);
    }

    @Override
    public boolean updateCliente(String nombre, String idActual, String idNuevo) {
        return hotel.updateCliente(nombre, idActual, idNuevo);
    }

    @Override
    public String obtenerDatosCliente(String id) {
        return hotel.obtenerDatosCliente(id);
    }

    @Override
    public boolean crearReserva(LocalDate fechaEntrada, LocalDate fechaSalida, Cliente cliente, Habitacion habitacion) {
        return hotel.crearReserva(fechaEntrada, fechaSalida, cliente, habitacion);
    }

    @Override
    public boolean eliminarReserva(Habitacion habitacion) {
        return hotel.eliminarReserva(habitacion);
    }

    @Override
    public String obtenerDatosReserva(LocalDate fechaEntrada) {
        return hotel.obtenerDatosReserva(fechaEntrada);
    }

    @Override
    public boolean crearServicio(String nombre, int precio) {
        return hotel.crearServicio(nombre, precio);
    }

    @Override
    public boolean eliminarServicio(String nombre) {
        return hotel.eliminarServicio(nombre);
    }

    @Override
    public boolean updateServicio(String nombreActual, String nombreNuevo, int precioActual, int precioNuevo) {
        return hotel.updateServicio(nombreActual,nombreNuevo,precioActual,precioNuevo);
    }

    @Override
    public String obtenerDatosServicio(String nombre) {
        return hotel.obtenerDatosServicio(nombre);
    }

    @Override
    public boolean crearHabitacion(int numero, int precio) {
        return hotel.crearHabitacion(numero, precio);
    }

    @Override
    public boolean eliminarHabitacion(int numero) {
        return hotel.eliminarHabitacion(numero);
    }

    @Override
    public boolean updateHabitacion(int numero, int precioActual, int precioNuevo) {
        return hotel.updateHabitacion(numero,precioActual,precioNuevo);
    }

    @Override
    public String obtenerDatosHabitacion(int numero) {
        return hotel.obtenerDatosHabitacion(numero);
    }
}
