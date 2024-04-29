package ar.edu.utn.frba.dds.domain;

public class Ubicacion {
    private String calle;
    private String numero;
    private String piso;
    private String departamento;

    public Ubicacion(String calle, String numero, String piso, String departamento) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
    }
}
