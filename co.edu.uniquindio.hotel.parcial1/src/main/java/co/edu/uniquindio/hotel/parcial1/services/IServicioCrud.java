package co.edu.uniquindio.hotel.parcial1.services;

public interface IServicioCrud {
    boolean crearServicio(String nombre,int precio);
    boolean eliminarServicio(String nombre);
    boolean updateServicio(String nombreActual,String nombreNuevo, int precioActual, int precioNuevo);
    String obtenerDatosServicio(String nombre);
}
