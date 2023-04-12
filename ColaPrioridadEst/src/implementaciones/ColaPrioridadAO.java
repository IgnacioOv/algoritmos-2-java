package implementaciones;

import interfaces.ColaPrioridadTDA;

public class ColaPrioridadAO implements ColaPrioridadTDA {

	@Override
	public void InicializarCola() {
		// TODO Auto-generated method stub

	}

	@Override
	public void AcolarPrioridad() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Desacolar() {
		// TODO Auto-generated method stub

	}

	@Override
	public int Primero() {
		return elementos[indice-1].valor;
	}

	@Override
	public int Prioridad() {
		
		return elementos[indice-1].prioridad;
	}

	@Override
	public boolean ColaVacia() {
		// TODO Auto-generated method stub
		return (indice == 0);
	}

}
