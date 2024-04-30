package ar.edu.utn.frba.dds.domain.viaje;

import ar.edu.utn.frba.dds.domain.Ubicacion;

import java.util.List;

public interface CalculadorDemora {

    public List<Float> obtenerDemoraEntreSecciones(List<Float> distancias);

    public Double tiempoEnRecorrer(Float distancia);
}
