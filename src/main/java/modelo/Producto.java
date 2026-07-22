package modelo;

public class Producto {
    private String codigoBarras;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String codigoBarras, String nombre, double precio, int stock) {
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters y Setters
    public String getCodigoBarras() { return codigoBarras; }
    public void setCodigoBarras(String codigoBarras) { this.codigoBarras = codigoBarras; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    // Método de negocio
    public void actualizarStock(int cantidad) {
        this.stock -= cantidad; // Resta el stock al vender
    }
}