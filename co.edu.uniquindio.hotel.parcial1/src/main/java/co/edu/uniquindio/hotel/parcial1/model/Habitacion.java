package co.edu.uniquindio.hotel.parcial1.model;

public class Habitacion {
    private int numero;
    private int precio;
    private Servicio servicio;


    public Habitacion(int numero, int precio, Servicio servicio){
        this.numero= numero;
        this.precio= precio;
        this.servicio = servicio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}
