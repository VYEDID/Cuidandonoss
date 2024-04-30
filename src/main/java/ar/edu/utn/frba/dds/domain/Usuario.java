package ar.edu.utn.frba.dds.domain;

import ar.edu.utn.frba.dds.domain.reaccion.Reaccion;
import ar.edu.utn.frba.dds.domain.viaje.Viaje;

import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private Ubicacion ubicacion;
    private int edad;
    private String sexo;
    private Reaccion reaccionIncidente;
    private Boolean activo = false;

    public void setReaccionIncidente(Reaccion reaccionIncidente) {
        this.reaccionIncidente = reaccionIncidente;
    }
    public Reaccion getReaccionIncidente() {
        return reaccionIncidente;
    }

    public Usuario(String nombre, String apellido, Ubicacion ubicacion, int edad, String sexo, Reaccion reaccionIncidente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ubicacion = ubicacion;
        this.edad = edad;
        this.sexo = sexo;
        this.reaccionIncidente = reaccionIncidente;
    }

    public void comenzarViaje(Viaje viaje) {}
}
