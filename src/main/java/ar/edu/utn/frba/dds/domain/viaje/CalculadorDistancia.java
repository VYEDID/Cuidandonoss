package ar.edu.utn.frba.dds.domain.viaje;

import ar.edu.utn.frba.dds.domain.Ubicacion;

import java.util.List;

public interface CalculadorDistancia {

    public float distanciaEntreDosPuntos(Ubicacion partida, Ubicacion destino);
    public float obtenerDistanciaEntreSecciones(List<Ubicacion> destinos);
}
