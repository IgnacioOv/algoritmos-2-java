package implementacion;

import api.PilaTDA;

public class PilaLD implements PilaTDA {
    Nodo origen;
    @Override
    public void InicializarPila() {
        origen = null;
    }

    @Override
    public void Apilar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.valor = x;
        nuevo.sig = origen;
    }

    @Override
    public void Desapilar() {
        origen.sig;
    }

    @Override
    public boolean PilaVacia() {
        return (origen==null);
    }

    @Override
    public int Tope() {
        return origen.valor;
    }
}
