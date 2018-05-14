public class ListaTicket<T>{
    int cantidad;
    Elemento<T> inicio, pivote;
    int costoman, costolec, costopasta;

    public ListaTicket(){
        cantidad = 0;
        inicio = pivote = null;
    }
    public ListaTicket(int cant, Elemento<T> objeto){
        this.cantidad = cant;
        inicio = pivote = objeto;
    }
    public void buscarTicket(String art, int can){
        Articulo cl = new Articulo(10);
        Articulo c2 = new Articulo(25);
        Articulo c3 = new Articulo(36);

            if (art.equals("Manzana") || art.equals("manzana")) {
                if (can <= cl.getCantidad()) {
                    int mercanciarest = cl.getCantidad();
                    mercanciarest = mercanciarest - can;
                    costoman = can * 3;
                    System.out.println("\nQuedan " + mercanciarest + " manzana(s) en stock");
                    System.out.println("\nTotal manzanas: $" + costoman);
                }else{
                    System.out.println("Cantidad mayor");
                }

            } else if (art.equals("Leche") || art.equals("leche")) {
                if (can <= c2.getCantidad()) {
                    int mercanciares = c2.getCantidad() - can;
                    System.out.println("\nQuedan " + mercanciares + " leche(s) en stock");
                    costolec = can * 23;
                    System.out.println("\nTotal leche: $" + costolec);
                }else{
                    System.out.println("Cantidad mayor");
                }
            } else if (art.equals("Pasta") || art.equals("pasta")) {
                if (can <= c3.getCantidad()) {
                    int mercanciares = c3.getCantidad() - can;
                    System.out.println("\nQuedan " + mercanciares + " pasta(s) en stock");
                    costopasta = can * 13;
                    System.out.println("\nTotal pasta: $" + costopasta);
                }else{
                    System.out.println("Cantidad mayor");
                }
            } else {
                System.out.println("Cantidad por encima de existencia");
            }
        }
        public int sumadeCostos(){
        int total = costolec + costoman + costopasta;
        return total;
        }

}