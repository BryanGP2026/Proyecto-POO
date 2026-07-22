package modelo;

public class Empleado extends Persona {
    private String codigoEmpleado;
    private double sueldo;

    public Empleado(String dni, String nombre, String telefono, String codigoEmpleado, double sueldo) {
        super(dni, nombre, telefono); // Llama al constructor de Persona
        this.codigoEmpleado = codigoEmpleado;
        this.sueldo = sueldo;
    }

    // Getters y Setters
    public String getCodigoEmpleado() { return codigoEmpleado; }
    public void setCodigoEmpleado(String codigoEmpleado) { this.codigoEmpleado = codigoEmpleado; }
    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }

    @Override
    public void mostrarDatos() {
        System.out.println("Empleado: " + getNombre() + " | Código: " + codigoEmpleado);
    }
}