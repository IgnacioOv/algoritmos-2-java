package interfaces;

public interface ColaPrioridadTDA {
    void InicializarCola();
    void Acolar(int x,int prioridad);
    void Desacolar();
    int Primero();
    boolean ColaVacia();
    void Mostrar();
    int prioridad();

}
