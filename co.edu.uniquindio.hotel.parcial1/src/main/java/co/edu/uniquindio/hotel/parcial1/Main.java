package co.edu.uniquindio.hotel.parcial1;

import co.edu.uniquindio.hotel.parcial1.factory.ModelFactory;
import co.edu.uniquindio.hotel.parcial1.model.Hotel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        mostrarClientes(modelFactory);
        buscarReservas(modelFactory);
        crudCliente(modelFactory);
    }

    private static void crudCliente(ModelFactory modelFactory) {
        crearCliente(modelFactory);
    }

    private static void crearCliente(ModelFactory modelFactory) {
        String nombre = "juan";
        String id = "10245874";
        boolean resultado = modelFactory.crearCliente(nombre, id);
        if(resultado == true){
            System.out.println("cliente creado correctamente");
        }else{
            System.out.println("cliente no creado");
        }
    }

    private static void mostrarClientes(ModelFactory modelFactory) {
        String id = "87654321B";
        modelFactory.mostrarClientes(id);
    }
    private static void buscarReservas(ModelFactory modelFactory) {
        LocalDate fechaEntrada = LocalDate.of(2024, 10, 1);
        modelFactory.buscarReservas(fechaEntrada);
    }
}