package principal;

import interfaz.PilaTDA;
import implementacion.PilaTF;

public class principal {

	public static PilaTDA CopiarPila (PilaTDA original) {
		PilaTDA aux = new PilaTF();
		PilaTDA copia = new PilaTF();
		aux.InicializarPila();
		copia.InicializarPila();
		// Primero pasamos original a aux //
		while (! original.PilaVacia()) {
			aux.Apilar(original.Tope());
			original.Desapilar();
		}
		// Ahora pasamos aux a original y a copia //
		while (! aux.PilaVacia()) {
			original.Apilar(aux.Tope());
			copia.Apilar(aux.Tope());
			aux.Desapilar();
		}
		return copia;
	}
	
	public static void MostrarPila(PilaTDA u) {
		PilaTDA x = CopiarPila(u);
		System.out.print('[');
		while (! x.PilaVacia()) {
			System.out.print(x.Tope());
			x.Desapilar();
			if(! x.PilaVacia())
				System.out.print(", ");
		}
		System.out.println(']');
	}
	
	public static void main(String[] args) {
		PilaTDA a = new PilaTF();
		a.InicializarPila();
		a.Apilar(4);
		a.Apilar(2);
		a.Apilar(5);
		a.Apilar(7);
		MostrarPila(a);
		MostrarPila(a);
	}

}
