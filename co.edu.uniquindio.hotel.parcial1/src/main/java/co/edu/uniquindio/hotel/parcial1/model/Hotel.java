package co.edu.uniquindio.hotel.parcial1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public Hotel(String nombre){
        this.nombre=nombre;
    }
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void addReserva(Reserva reserva){
        reservas.add(reserva);
    }
    public void mostrarClientes(String id) {
        for(Cliente cliente: getClientes()){
            if(cliente.getId().equals(id)){
                System.out.println(cliente.toString());
            }
        }
    }
    public void buscarReservas(LocalDate fechaEntrada) {
        for(Reserva reserva: getReservas()){
            if(reserva.getFechaEntrada().equals(fechaEntrada)){
                System.out.println(reserva.toString());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public boolean crearPropietario(String nombre, String id) {
        Cliente clienteExistente = obtenerCliente(id);
        if(clienteExistente == null){
        Cliente cliente = new Cliente(nombre, id, null);
        getClientes().add(cliente);
        return true;
        }else{
        return false;
        }
    }

    private Cliente obtenerCliente(String id) {
        Cliente clienteExistente = null;
        for(Cliente cliente: getClientes()){
            if(cliente.getId().equals(id)){
                clienteExistente = cliente;
                break;
            }
        }
        return clienteExistente;
    }
}
