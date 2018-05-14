public class Articulo {

    public String clave;
    private String descripcion;
    private String precio;
    private String caducidad;
    public int cantidad;

    public Articulo(){
        this.clave = "";
        this.descripcion = "";
        this.precio = "";
        this.caducidad = "";
        this.cantidad = 0;
    }
    public Articulo (String cl, String de, String pr, String ca, int can){
        this.clave = cl;
        this.descripcion = de;
        this.precio = pr;
        this.caducidad = ca;
        this.cantidad = can;
    }
    public Articulo(int cant){
        this.cantidad = cant;
    }
    public String getClave(){
        return clave;
    }
    public void setClave (String clave){
        this.clave = clave;
    }
    public String getDescripcion (){
        return descripcion;
    }
    public void setDescripcion (String descripcion){
        this.descripcion = descripcion;
    }
    public String getPrecio (){
        return precio;
    }
    public void setPrecio (String precio){
        this.precio = precio;
    }
    public String getCaducidad(){
        return caducidad;
    }
    public void setCaducidad (String caducidad){
        this.caducidad = caducidad;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    @Override
    public String toString (){
        return "\nProducto:\n" +
                "Clave: " + getClave() +
                "\nDescripción: " + getDescripcion() +
                "\nPrecio: " + getPrecio() +
                "\nFecha de Caducidad: " + getCaducidad() +
                "\nCantidad: " + getCantidad();
    }
}
