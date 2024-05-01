package ar.edu.utn.frba.dds.domain.viaje;

import ar.edu.utn.frba.dds.domain.Ubicacion;

public interface AdapterCalculadorDistancia {

    public float distanciaEntreDosPuntos(Ubicacion partida, Ubicacion destino);
}
