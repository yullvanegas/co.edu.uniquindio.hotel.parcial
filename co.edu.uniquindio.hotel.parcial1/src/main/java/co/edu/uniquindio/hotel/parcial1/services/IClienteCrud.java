package co.edu.uniquindio.hotel.parcial1.services;

public interface IClienteCrud {

    boolean crearCliente(String nombre,String id);
    boolean eliminarCliente(String id);
    boolean updateCliente(String nombre, String idactual, String idNuevo);
    String obtenerDatosCliente(String id);
}
