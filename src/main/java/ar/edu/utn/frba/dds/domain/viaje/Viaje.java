package ar.edu.utn.frba.dds.domain.viaje;

import ar.edu.utn.frba.dds.domain.Ubicacion;
import ar.edu.utn.frba.dds.domain.Usuario;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.stream;

public class Viaje {
    private Usuario usuario;
    private String estado;
    private Ubicacion direccionActual;
    private List<Ubicacion> destinos;
    private List<Usuario> cuidadoresPropuestos;
    private List<Usuario> cuidadoresElegidos;
    private Double demoraAproxEnMins;
    private LocalDateTime tiempoDeInicio;
    private Integer tiempoDemora;
    private Boolean avisoSalud;

    public void calcularDemoraAproximada (CalculadorDistancia cDist, CalculadorDemora cDem){
        List<Ubicacion> origenYDestinos = destinos;
        origenYDestinos.add(0, direccionActual);

        this.demoraAproxEnMins = cDem.tiempoEnRecorrer(cDist.obtenerDistanciaEntreSecciones(origenYDestinos));
    }

    public void evaluarDemora(){
        // Si la demora total es mayor al tiempo de demora de demora aprox en minutos calculado, se reacciona
        // La otra condicion es que si el tiempo que tarda en una seccion es mayor al esperado, se reacciona
    }
}
