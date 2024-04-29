package ar.edu.utn.frba.dds.domain.viaje;

import ar.edu.utn.frba.dds.domain.Ubicacion;
import ar.edu.utn.frba.dds.domain.Usuario;

import java.util.List;

import static java.util.Arrays.stream;

public class Viaje {

    private Usuario usuario;
    private Boolean estado;
    private Ubicacion direccionActual;
    private List<Ubicacion> destinos;
    private List<Usuario> cuidadoresPropuestos;
    private Integer demoraAproxEnMins;
    private Integer tiempoDeInicio;
    private List<Usuario> cuidadoresElegidos;
    private Integer tiempoDemora;
    private Boolean avisoSalud;

    public void calcularDemoraAproximada (CalculadorDistancia calculadorDistancia, CalculadorDemora calculadorDemora){
        float distanciaTotalEnMetros = (obtenerDistanciaEntreSecciones(calculadorDistancia)).stream().mapToDouble().sum();
        float demoraTotal = 0;
        List<Float> demoraEntreSecciones ;

        if(avisoSalud) {
            demoraTotal =
        } else {
            demoraEntreSecciones = obtenerDemoraEntreSecciones(calculadorDemora);
            demoraTotal = demoraEntreSecciones.stream().map(this::evaluarDemora).sum();
        }
    }

    private List<Float> obtenerDemoraEntreSecciones(CalculadorDemora calculadorDemora) {
    }

    public Float evaluarDemora(Float demoraEnSeccion){
    if(demoraEnSeccion > tiempoDemora){
        usuario.getReaccionIncidente().reaccionar(this);
        return demoraEnSeccion;
    }

    // Si no cumple esta condicion, evaluar la demora
    }

    public void aniadirCuidadores(List<Usuario> cuidadores){

    }

    public List<Float> obtenerDistanciaEntreSecciones(CalculadorDistancia caluladorDstancia){

    }


}
