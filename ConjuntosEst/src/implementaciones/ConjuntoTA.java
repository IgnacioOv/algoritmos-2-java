package implementaciones;

import interfaces.ConjuntoTDA;

public class ConjuntoTA implements ConjuntoTDA {
	int [] a;
	int cant;
	@Override
	public void InicializarConjunto() {
		a = new int[20];
		cant = 0;

	}

	
	@Override
	public void Agregar(int x) {
		if (! this.Pertenece(x)) {
			a[cant] = x;
			cant++;
			
		}
	}
	public void Sacar(int x) {
		int i = 0;
		while (i < cant && a[i] != x) {
			i++;
		}
		if (i < cant) {
			a[i] = a[cant - 1];
			cant--;
		}
}
	
	@Override
	public boolean Pertenece(int x) {
		
		return false;
	}

	@Override
	public int Elegir() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean ConjuntoVacio() {
		// TODO Auto-generated method stub
		return false;
	}

}
