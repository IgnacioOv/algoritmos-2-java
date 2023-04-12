package implementacion;

import interfaz.ColaTDA;

public class ColaLD extends Nodo implements ColaTDA {
    Nodo primero;
    Nodo ultimo;
    @Override
    public void InicializarCola() {
        primero = null;
        ultimo = null;
    }

    @Override
    public void Acolar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.valor = x;
        nuevo.sig = null;
        if(primero == null){
            primero = nuevo;
            ultimo = nuevo;
        }else{
            ultimo.sig = nuevo;
            ultimo = nuevo;
        }
    }

    @Override
    public void Desacolar() {
        primero = primero.sig;
        if (primero==null){
            ultimo = null;
        }
    }

    @Override
    public int Primero() {
        return primero.valor;
    }

    @Override
    public boolean ColaVacia() {
        return (primero == null);
    }

    @Override
    public void Mostrar() {
        Nodo viajero = primero;
        System.out.print("[");
        while(viajero!=null){
        System.out.print(viajero.valor);
        viajero = viajero.sig;
        if (viajero != null ){
            System.out.print(", ");
        }


        }
        System.out.print("]");
    }
}
