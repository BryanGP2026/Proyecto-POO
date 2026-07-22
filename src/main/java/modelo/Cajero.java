package modelo;

public class Cajero extends Empleado {
    private int numeroCaja;

    public Cajero(String dni, String nombre, String telefono, String codigoEmpleado, double sueldo, int numeroCaja) {
        super(dni, nombre, telefono, codigoEmpleado, sueldo);
        this.numeroCaja = numeroCaja;
    }

    public int getNumeroCaja() { return numeroCaja; }
    public void setNumeroCaja(int numeroCaja) { this.numeroCaja = numeroCaja; }

    public void procesarCobro() {
        System.out.println("El cajero " + getNombre() + " está cobrando en la caja " + numeroCaja);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cajero: " + getNombre() + " | Caja Asignada: " + numeroCaja);
    }
}