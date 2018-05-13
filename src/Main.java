import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Articulo c1 = new Articulo("Manzana","Fruto rojo o amarillo o verde con semillas","$25 k","3 días");
        Articulo c2 = new Articulo("Leche","Bebida que viene de las vacas","$20 la pieza","2 semanas");
        Articulo c3 = new Articulo("Pasta","Para lasagna","$10","25/09/19");

        Elemento<Articulo> primero = new Elemento<>(c1);
        Elemento<Articulo> segundo = new Elemento<>(c2);
        Elemento<Articulo> tercero = new Elemento<>(c3);
        // primero.siguiente=segundo;
        Lista<Articulo> listaC= new Lista<> (primero);
        listaC.insertar(segundo);
        listaC.insertar(tercero);
        System.out.println(listaC.nelementos);
        System.out.println(listaC.recorrer());
        listaC.eliminar();
        System.out.println(listaC.nelementos + "\n" + listaC.recorrer());

        //buscar articulos
        System.out.println("Introduce la clave del producto: ");
        Scanner leeCodigo=new Scanner(System.in);
        String claves= leeCodigo.next();
        listaC.buscar(claves);
    }
}
