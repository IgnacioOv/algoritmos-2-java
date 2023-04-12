package principal;

import implementaciones.ColaPrioridadAO;
import interfaces.ColaPrioridadTDA;

public class principal {
	public static ColaPrioridadTDA CopiarColaPrioridad(ColaPrioridadTDA origen) {
		ColaPrioridadTDA aux = new ColaPrioridadAO();
		ColaPrioridadTDA copia = new ColaPrioridadAO();
		int v;
		int p;
		while(! origen.ColaVacia()) {
			v = origen.Primero();
			p = origen.Prioridad();
			aux.AcolarPrioridad(v,p);
			origen.Desacolar();
		}
		return null;
		
	}
	public static void main(String[] args) {
	

	}

}
