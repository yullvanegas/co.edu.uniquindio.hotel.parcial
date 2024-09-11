package co.edu.uniquindio.hotel.parcial1.builder;

import co.edu.uniquindio.hotel.parcial1.model.Cliente;
import co.edu.uniquindio.hotel.parcial1.model.Reserva;

public class ClienteBuilder {
    private String nombre;
    private String id;
    private Reserva reserva;

    public ClienteBuilder nombre(String nombre){
        this.nombre=nombre;
        return this;
    }
    public ClienteBuilder id(String id){
        this.id=id;
        return this;
    }
    public ClienteBuilder reserva(Reserva reserva){
        this.reserva=reserva;
        return this;
    }
    public Cliente build(){
        return new Cliente(nombre,id,reserva);
    }
}
