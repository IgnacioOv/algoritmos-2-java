package prin;

public class prin {


	public static void MostrarLista(Nodo inicio){
		Nodo viajero = inicio;
		System.out.print("<");
		while(viajero!=null){
			System.out.print(viajero.valor);
			viajero = viajero.sig;
			if (viajero != null){
				System.out.print(", ")
			}
			System.out.println(">");
		}
	}

	public static class Nodo{
		int valor;
		Nodo sig;
		
	}
	
	public static void main(String[] args) {
		Nodo uno = new Nodo();
		Nodo dos = new Nodo();
		Nodo tres = new Nodo();
		uno.valor = 1;
		dos.valor = 2;
		tres.valor = 3;
		uno.sig = dos;
		dos.sig = tres;
		tres.sig = null;
		MostrarLista(dos);
		
	}
	
	
}
