package modelo;

public abstract class Persona {
    // Atributos privados (Encapsulamiento)
    private String dni;
    private String nombre;
    private String telefono;

    // Constructor (Atajo en NetBeans: Alt + Insert -> Constructor)
    public Persona(String dni, String nombre, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters y Setters (Atajo: Alt + Insert -> Getter and Setter)
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    // Método abstracto (Polimorfismo para que Cliente y Empleado lo sobrescriban)
    public abstract void mostrarDatos();
}