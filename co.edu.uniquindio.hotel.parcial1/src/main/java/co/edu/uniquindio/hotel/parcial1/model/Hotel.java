package co.edu.uniquindio.hotel.parcial1.model;

import co.edu.uniquindio.hotel.parcial1.builder.ClienteBuilder;
import co.edu.uniquindio.hotel.parcial1.builder.HotelBuilder;
import co.edu.uniquindio.hotel.parcial1.services.IClienteCrud;
import co.edu.uniquindio.hotel.parcial1.services.IHabitacionCrud;
import co.edu.uniquindio.hotel.parcial1.services.IReservaCrud;
import co.edu.uniquindio.hotel.parcial1.services.IServicioCrud;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel implements IClienteCrud, IReservaCrud, IServicioCrud, IHabitacionCrud {
    private String nombre;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();
    private List<Habitacion> habitaciones = new ArrayList<>();
    private List<Servicio> servicios = new ArrayList<>();

    public Hotel(String nombre){
        this.nombre=nombre;
    }
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void addReserva(Reserva reserva){
        reservas.add(reserva);
    }
    public void addHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }
    public void addServicio(Servicio servicio) {
        servicios.add(servicio);
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

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public boolean crearCliente(String nombre, String id) {
        Cliente clienteExistente = obtenerCliente(id);
        if(clienteExistente == null){
        Cliente cliente = new Cliente(nombre, id, null);
        getClientes().add(cliente);
        return true;
        }else{
        return false;
        }
    }

    @Override
    public boolean eliminarCliente(String id) {
        Cliente clienteExistente = obtenerCliente(id);
        if(clienteExistente != null){
            getClientes().remove(clienteExistente);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean updateCliente(String nombre, String idActual, String idNuevo) {
        Cliente clienteExistente = obtenerCliente(idActual);
        if(clienteExistente != null){
            clienteExistente.setNombre(nombre);
            clienteExistente.setId(idNuevo);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String obtenerDatosCliente(String id) {
        Cliente clienteExistente = obtenerCliente(id);
        if(clienteExistente != null){
           return clienteExistente.toString();
        }else {
            return "no se encontro nada";
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

    @Override
    public boolean crearReserva(LocalDate fechaEntrada, LocalDate fechaSalida, Cliente cliente, Habitacion habitacion) {
        Habitacion habitacionExistente = obtenerHabitacion(habitacion);
        if(habitacionExistente == null){
            Reserva reserva = new Reserva(fechaEntrada, fechaSalida, cliente,habitacion);
            getReservas().add(reserva);
            return true;
        }else{
            return false;
        }
    }
    private Habitacion obtenerHabitacion(Habitacion habitacion1) {
        Habitacion habitacionExistente = null;
        for(Habitacion habitacion: getHabitaciones()){
            if(habitacion.getNumero() == habitacion1.getNumero()){
                habitacionExistente = habitacion;
                break;
            }
        }
        return habitacionExistente;
    }

    @Override
    public boolean eliminarReserva(Habitacion habitacion) {
        Habitacion habitacionExistente = obtenerHabitacion(habitacion);
        if(habitacionExistente != null){
            getReservas().remove(habitacionExistente);
            return true;
        }else{
            return false;
        }
    }
    public static HotelBuilder builder(){
        return new HotelBuilder();
    }

    @Override
    public boolean crearServicio(String nombre, int precio) {
        Servicio servicioExistente = obtenerServicio(nombre);
        if(servicioExistente == null){
            Servicio servicio = Servicio.builder().nombre(nombre).precio(precio).build();
            getServicios().add(servicio);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean eliminarServicio(String nombre) {
        Servicio servicioExistente = obtenerServicio(nombre);
        if(servicioExistente != null){
            getServicios().remove(servicioExistente);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean updateServicio(String nombreActual, String nombreNuevo, int precioActual, int precioNuevo) {
        Servicio servicioExistente = obtenerServicio(nombreActual);
        if(servicioExistente != null){
            servicioExistente.setNombre(nombreNuevo);
            servicioExistente.setPrecio(precioNuevo);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String obtenerDatosServicio(String nombre) {
        Servicio servicioExistente = obtenerServicio(nombre);
        if(servicioExistente != null){
            return servicioExistente.toString();
        }else {
            return "no se encontro nada";
        }
    }

    private Servicio obtenerServicio(String nombre) {
        Servicio servicioExistente = null;
        for(Servicio servicio: getServicios()){
            if(servicio.getNombre().equals(nombre)){
                servicioExistente = servicio;
                break;
            }
        }
        return servicioExistente;
    }

    @Override
    public boolean crearHabitacion(int numero, int precio) {
        Habitacion habitacionExistente = obtenerHabitacion1(numero);
        if(habitacionExistente == null){
            Habitacion habitacion = Habitacion.builder().numero(numero).precio(precio).build();
            getHabitaciones().add(habitacion);
            return true;
        }else{
            return false;
        }
    }
    private Habitacion obtenerHabitacion1(int numero) {
        Habitacion habitacionExistente = null;
        for(Habitacion habitacion: getHabitaciones()){
            if(habitacion.getNumero()== numero){
                habitacionExistente = habitacion;
                break;
            }
        }
        return habitacionExistente;
    }

    @Override
    public boolean eliminarHabitacion(int numero) {
        Habitacion habitacionExistente = obtenerHabitacion1(numero);
        if(habitacionExistente != null){
            getHabitaciones().remove(habitacionExistente);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean updateHabitacion(int numero, int precioActual, int precioNuevo) {
        Habitacion habitacionExistente = obtenerHabitacion1(numero);
        if(habitacionExistente != null){
            habitacionExistente.setNumero(numero);
            habitacionExistente.setPrecio(precioNuevo);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String obtenerDatosHabitacion(int numero) {
        Habitacion habitacionExistente = obtenerHabitacion1(numero);
        if(habitacionExistente != null){
            return habitacionExistente.toString();
        }else {
            return "no se encontro nada";
        }
    }
}
