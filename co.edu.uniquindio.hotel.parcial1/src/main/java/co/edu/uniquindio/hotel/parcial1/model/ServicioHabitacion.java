package co.edu.uniquindio.hotel.parcial1.model;

public class ServicioHabitacion extends Servicio{
    public ServicioHabitacion(String nombre, int precio) {
        super(nombre, precio);
    }
    @Override
    public void consumir() {
        // Implementación específica de consumir para ServicioHabitacion
        System.out.println("El servicio de habitación " + getNombre() + " ha sido consumido.");
    }
}
