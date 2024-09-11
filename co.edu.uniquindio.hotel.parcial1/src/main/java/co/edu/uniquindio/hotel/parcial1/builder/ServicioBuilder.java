package co.edu.uniquindio.hotel.parcial1.builder;

import co.edu.uniquindio.hotel.parcial1.model.Servicio;

import java.time.LocalDate;

public class ServicioBuilder {
    private String nombre;
    private int precio;

    public ServicioBuilder nombre(String nombre){
        this.nombre=nombre;
        return this;
    }
    public ServicioBuilder precio(int precio){
        this.precio=precio;
        return this;
    }
    public Servicio build(){
        return new Servicio(nombre, precio);
    }
}
