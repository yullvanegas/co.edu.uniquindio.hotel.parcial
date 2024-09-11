package co.edu.uniquindio.hotel.parcial1;

import co.edu.uniquindio.hotel.parcial1.builder.ClienteBuilder;
import co.edu.uniquindio.hotel.parcial1.factory.ModelFactory;
import co.edu.uniquindio.hotel.parcial1.model.Cliente;
import co.edu.uniquindio.hotel.parcial1.model.Habitacion;
import co.edu.uniquindio.hotel.parcial1.model.Hotel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        mostrarClientes(modelFactory);
        buscarReservas(modelFactory);
        crudCliente(modelFactory);
        crudReserva(modelFactory);
        crudServicio(modelFactory);
        crudHabitacion(modelFactory);
    }


    private static void crudReserva(ModelFactory modelFactory) {
        crearReserva(modelFactory);
        eliminarReserva(modelFactory);
        obtenerDatosReserva(modelFactory);
    }

    private static void obtenerDatosReserva(ModelFactory modelFactory) {
        LocalDate fechaEntrada = LocalDate.of(2024, 10, 31);
        String resultado = modelFactory.obtenerDatosReserva(fechaEntrada);
        System.out.println(resultado);
    }


    private static void crearReserva(ModelFactory modelFactory) {
        LocalDate fechaEntrada = LocalDate.of(2024, 10, 31);
        LocalDate fechaSalida = LocalDate.of(2024, 11, 5);
        Cliente cliente = Cliente.builder()
                        .nombre("pepito")
                        .id("3312")
                        .build();
        Habitacion habitacion = Habitacion.builder()
                        .numero(4)
                        .precio(50)
                        .build();
        boolean resultado = modelFactory.crearReserva(fechaEntrada, fechaSalida, cliente, habitacion);
        notificacionReserva(resultado, "creada");
    }
    private static void eliminarReserva(ModelFactory modelFactory) {
        Habitacion habitacion = Habitacion.builder()
                        .numero(1)
                        .precio(50)
                        .build();
        boolean resultado = modelFactory.eliminarReserva(habitacion);
        notificacionReserva(resultado, "eliminada");
    }
    private static void crudHabitacion(ModelFactory modelFactory) {
        crearHabitacion(modelFactory);
        eliminarHabitacion(modelFactory);
        updateHabitacion(modelFactory);
        obtenerDatosHabitacion(modelFactory);
    }

    private static void obtenerDatosHabitacion(ModelFactory modelFactory) {
        int numero = 1;
        String resultado = modelFactory.obtenerDatosHabitacion(numero);
        System.out.println(resultado);
    }

    private static void updateHabitacion(ModelFactory modelFactory) {
        int numero = 1;
        int precioActual = 50;
        int precioNuevo = 30;
        boolean resultado = modelFactory.updateHabitacion(numero, precioActual,precioNuevo);
        notificacionHabitacion(resultado, "actualizada");
    }

    private static void eliminarHabitacion(ModelFactory modelFactory) {
        int numero = 2;
        boolean resultado = modelFactory.eliminarHabitacion(numero);
        notificacionHabitacion(resultado, "eliminada");
    }

    private static void crearHabitacion(ModelFactory modelFactory) {
        int numero = 9;
        int precio = 70;
        boolean resultado = modelFactory.crearHabitacion(numero, precio);
        notificacionHabitacion(resultado, "creada");
    }
    private static void crudServicio(ModelFactory modelFactory) {
        crearServicio(modelFactory);
        eliminarServicio(modelFactory);
        updateServicio(modelFactory);
        obtenerDatosServicio(modelFactory);
    }

    private static void obtenerDatosServicio(ModelFactory modelFactory) {
        String nombre = "toallas";
        String resultado = modelFactory.obtenerDatosServicio(nombre);
        System.out.println(resultado);
    }

    private static void updateServicio(ModelFactory modelFactory) {
        String nombreActual = "desayuno";
        String nombreNuevo = "peliculas";
        int precioActual = 50;
        int precioNuevo = 30;
        boolean resultado = modelFactory.updateServicio(nombreActual, nombreNuevo, precioActual,precioNuevo);
        notificacionServicio(resultado, "actualizado");
    }

    private static void eliminarServicio(ModelFactory modelFactory) {
            String nombre = "limpieza";
            boolean resultado = modelFactory.eliminarServicio(nombre);
            notificacionServicio(resultado, "eliminado");
    }

    private static void crearServicio(ModelFactory modelFactory) {
        String nombre = "limpieza";
        int precio = 70;
        boolean resultado = modelFactory.crearServicio(nombre, precio);
        notificacionServicio(resultado, "creado");
    }

    private static void crudCliente(ModelFactory modelFactory) {

        crearCliente(modelFactory);
        eliminarCliente(modelFactory);
        updateCliente(modelFactory);
        obtenerDatosCliente(modelFactory);
    }

    private static void crearCliente(ModelFactory modelFactory) {
        String nombre = "juan";
        String id = "10245874";
        boolean resultado = modelFactory.crearCliente(nombre, id);
        notificacion(resultado, "creado");
    }

    private static void notificacion(boolean resultado, String mensaje) {
        if(resultado == true){
            System.out.println("cliente "+mensaje+" correctamente");
        }else{
            System.out.println("cliente no "+mensaje);
        }
    }
    private static void notificacionHabitacion(boolean resultado, String mensaje) {
        if (resultado == true) {
            System.out.println("habitacion " + mensaje + " correctamente");
        } else {
            System.out.println("habitacion no " + mensaje);
        }
    }
    private static void notificacionServicio(boolean resultado, String mensaje) {
        if(resultado == true){
            System.out.println("servicio "+mensaje+" correctamente");
        }else{
            System.out.println("servicio no "+mensaje);
        }
    }
    private static void notificacionReserva(boolean resultado, String mensaje) {
        if(resultado == true){
            System.out.println("Reserva "+mensaje+" correctamente");
        }else{
            System.out.println("Reserva no "+mensaje);
        }
    }

    private static void eliminarCliente(ModelFactory modelFactory) {
        String id = "10245874";
        boolean resultado = modelFactory.eliminarCliente(id);
        notificacion(resultado, "eliminado");

    }
    private static void updateCliente(ModelFactory modelFactory) {
        String nombre = "ourus";
        String idActual = "87654321B";
        String idNuevo = "1994";
        boolean resultado = modelFactory.updateCliente(nombre, idActual, idNuevo);
        notificacion(resultado, "actualizado");
    }
    private static void obtenerDatosCliente(ModelFactory modelFactory) {
        String id = "87654321B";
        String resultado = modelFactory.obtenerDatosCliente(id);
        System.out.println(resultado);
    }

    private static void mostrarClientes(ModelFactory modelFactory) {
        String id = "1994";
        modelFactory.mostrarClientes(id);
    }
    private static void buscarReservas(ModelFactory modelFactory) {
        LocalDate fechaEntrada = LocalDate.of(2024, 10, 1);
        modelFactory.buscarReservas(fechaEntrada);
    }
}