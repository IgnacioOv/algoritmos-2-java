package principal;

public class Main {

    public static Nodo Eliminar(Nodo origen, int x){
        if (origen.valor == x){
            return origen.sig;
        }else{
            Nodo viajero = origen;
            while(viajero.sig!=null && viajero.sig.valor != x){
                viajero = viajero.sig;
            }
            if (viajero.sig != null)
                viajero.sig = viajero.sig.sig;
            return origen;
        }
    }
    public static Nodo AgregarEnOrden(Nodo origen, int x){
        Nodo nuevo = new Nodo();
        nuevo.valor = x;
        if(origen == null){
            nuevo.sig = null;
            return nuevo;
        }else if(origen.valor > x){
            nuevo.sig = origen;
            return nuevo;
        }else{
            Nodo viajero = origen;
            while(viajero.sig != null && viajero.sig.valor <=x)
                viajero = viajero.sig;
            nuevo.sig = viajero.sig;
            viajero.sig = nuevo;
            return origen;
        }
    }
    public static Nodo AgregarAtras(Nodo origen, int x){
        Nodo nuevo = new Nodo();
        nuevo.valor = x;
        nuevo.sig = null;
        if (origen == null){
            return nuevo;
        }else{
            Nodo viajero = origen;
            while (viajero.sig != null){
                viajero = viajero.sig;
            }
            viajero.sig = nuevo;
            return origen;
        }
    }
    public static Nodo AgregarAdelante(Nodo origen, int x){
        Nodo nuevo = new Nodo();
        nuevo.valor = x;
        nuevo.sig = origen;
        origen = nuevo;
        return origen;
    }
    public static void MostrarLista(Nodo inicio){
        Nodo viajero = inicio;
        System.out.print("<");
        while(viajero!=null){
            System.out.print(viajero.valor);
            viajero = viajero.sig;
            if (viajero != null){
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }

    public static class Nodo{
        int valor;
        Nodo sig;
    }
    public static void main(String[] args) {
        Nodo inicial = null;
        inicial = AgregarEnOrden(inicial,4);
        inicial = AgregarEnOrden(inicial,7);
        inicial = AgregarEnOrden(inicial,2);
        inicial = AgregarEnOrden(inicial,8);
        inicial = AgregarEnOrden(inicial,5);
        inicial = AgregarEnOrden(inicial,1);
        MostrarLista(inicial);
        inicial = Eliminar(inicial,2);
        MostrarLista(inicial);
    }
    
}
