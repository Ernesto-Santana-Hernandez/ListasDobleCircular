package listasdoblecircular;

public class Nodo {

    int dato;
    Nodo siguiente;
    Nodo fin;

    Nodo(int a) {
        dato = a;
        siguiente = null;
        fin = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

}
