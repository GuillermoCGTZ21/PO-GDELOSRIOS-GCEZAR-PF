import java.util.Scanner;

public class Lista<T> {

    Elemento<T> inicio, pivote;
    int nelementos;


    public Lista() {
        inicio = pivote = null;
        nelementos = 0;
    }

    public Lista(Elemento<T> objeto) {
        inicio = pivote = objeto;
        nelementos = 1;
    }

    public void insertar(Elemento<T> objeto) {
        if (nelementos == 0) {
            //nelementos ++; Se movió para afuera porque se repite.
            inicio = pivote = objeto;
        } else {
            //nelementos++; Se movió para afuera porque se repite.
            //Objeto es de tipo Elemento. Necesitmos ver
            objeto.siguiente = inicio;
            inicio = pivote = objeto;
        }
        nelementos++;
        //Si en un If, encontramos las mismas líneas de código, estas se tienen que poner afuera.

    }

    public String recorrer() {
        String datos = "";
        pivote = inicio;
        for (int i = 0; i < nelementos; i++) {
            datos += pivote.attrG.toString();
            pivote = pivote.siguiente;
        }
        return datos;
    }

    public void eliminar() {
        inicio = inicio.siguiente;
        nelementos--;
        if (nelementos == 0) {
            inicio = pivote = null;
        }
    }

    public void buscar(String claves) {

        //Articulo art = new Articulo();
        //String codigoABuscar = art.getClave();
        if (claves.equals("Manzana") || claves.equals("manzana")) {
            Articulo c1 = new Articulo("Manzana","Fruto rojo o amarillo o verde con semillas","$25 k","3 días",10);
            System.out.println(c1.toString());
        }
        else if (claves.equals("Leche") || claves.equals("leche")) {
            Articulo c1 = new Articulo("Leche","Bebida que viene de las vacas","$20 la pieza","2 semanas",25);
            System.out.println(c1.toString());
        }
        else if (claves.equals("Pasta") || claves.equals("pasta")) {
            Articulo c1 = new Articulo("Pasta","Para lasagna","$10","25/09/19",36);
            System.out.println(c1.toString());
        }else {
            System.out.println("\nEl código no coincide con ningun Artículo");
        }
    }
}





