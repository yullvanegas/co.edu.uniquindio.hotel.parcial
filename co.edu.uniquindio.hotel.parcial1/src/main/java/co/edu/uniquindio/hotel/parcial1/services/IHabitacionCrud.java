package co.edu.uniquindio.hotel.parcial1.services;

public interface IHabitacionCrud {
    boolean crearHabitacion(int numero,int precio);
    boolean eliminarHabitacion(int numero);
    boolean updateHabitacion(int numero, int precioActual, int precioNuevo);
    String obtenerDatosHabitacion(int numero);
}
