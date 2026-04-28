//Implementare qui la classe Nodo
public class Nodo<T> {
    T dato;
    Nodo<T> next;

    public Nodo(T dato) {
        this.dato = dato;
        this.next = null;
    }
}
