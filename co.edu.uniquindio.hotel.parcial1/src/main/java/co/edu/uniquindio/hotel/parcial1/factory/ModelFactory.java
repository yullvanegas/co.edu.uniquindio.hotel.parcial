package co.edu.uniquindio.hotel.parcial1.factory;

import co.edu.uniquindio.hotel.parcial1.model.Cliente;
import co.edu.uniquindio.hotel.parcial1.model.Hotel;
import co.edu.uniquindio.hotel.parcial1.model.Reserva;
import co.edu.uniquindio.hotel.parcial1.services.IClienteCrud;

import java.time.LocalDate;

public class ModelFactory implements IClienteCrud {
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
        hotel = new Hotel("ejemplo");
        Cliente cliente1 = new Cliente("Juan Pérez", "12345678A", null);
        Cliente cliente2 = new Cliente("Ana Gómez", "87654321B", null);
        Reserva reserva1 = new Reserva(LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 10), cliente1, null);
        Reserva reserva2 = new Reserva(LocalDate.of(2024, 11, 5), LocalDate.of(2024, 11, 15), cliente2,null);


        hotel.addCliente(cliente1);
        hotel.addCliente(cliente2);
        hotel.addReserva(reserva1);
        hotel.addReserva(reserva2);
    }


    @Override
    public boolean crearCliente(String nombre, String id) {
        return hotel.crearPropietario(nombre, id);
    }
}
