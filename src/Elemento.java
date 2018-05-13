public class Elemento <T>{
    public T attrG;
    public Elemento siguiente;

    public Elemento (T objeto){
        this.attrG = objeto;
        this.siguiente = null;
    }
}
