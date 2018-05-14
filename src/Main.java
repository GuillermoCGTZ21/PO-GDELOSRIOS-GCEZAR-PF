import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Articulo c1 = new Articulo("Manzana","Fruto rojo o amarillo o verde con semillas","$25 k","3 días",10);
        Articulo c2 = new Articulo("Leche","Bebida que viene de las vacas","$20 la pieza","2 semanas",25);
        Articulo c3 = new Articulo("Pasta","Para lasagna","$10","25/09/19",36);

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

        //buscar Ticket
        ListaTicket<Articulo> listaT = new ListaTicket<> ();
        System.out.println("¿Cuantos artículos vas a comprar? (3,2 o 1 artículo)");
        Scanner volver = new Scanner(System.in);
        String volver2 = volver.next();
        int cantidadcompra = Integer.parseInt(volver2);
        String clavess = null;
        String digitos = null;
        for(int i = 0; i<cantidadcompra; i++){
            System.out.println("¿Producto que desea comprar?");
            Scanner leeCodido = new Scanner(System.in);
            clavess = leeCodido.next();
            System.out.println("¿Cantidad que deseas comprar?");
            Scanner leedigito = new Scanner(System.in);
            digitos = leedigito.next();
            int digito = Integer.parseInt(digitos);
            listaT.buscarTicket(clavess,digito);
        }
        System.out.println("\nTICKET:\n"+ digitos + " " + clavess);
        System.out.println("TOTAL DE COMPRA= $" +listaT.sumadeCostos());
    }
}
