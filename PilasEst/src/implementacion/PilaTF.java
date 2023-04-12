package implementacion;

import interfaz.PilaTDA;

public class PilaTF implements PilaTDA {

	int[] a;
	int indice;
	
	@Override
	public void InicializarPila() {
		a = new int[111];
		indice = 0;
	}

	@Override
	public void Apilar(int x) {
		a[indice] = x;
		indice++;
	}

	@Override
	public void Desapilar() {
		indice--;
	}

	@Override
	public int Tope() {
		return a[indice - 1];
	}

	@Override
	public boolean PilaVacia() {
		return (indice == 0);
	}

}
