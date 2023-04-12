package principal;

import implementacion.ColaLD;
import interfaz.ColaTDA;

public class Main {
    public static void main(String[] args) {
        ColaTDA prueba = new ColaLD();
        prueba.InicializarCola();
        prueba.Acolar(7);
        prueba.Acolar(5);
        prueba.Acolar(9);
        prueba.Mostrar();
        prueba.Desacolar();
        prueba.Mostrar();


    }
}