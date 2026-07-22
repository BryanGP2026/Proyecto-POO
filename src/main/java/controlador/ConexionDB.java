package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    // Credenciales de tu base de datos MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/minimarket_poo";
    private static final String USUARIO = "root"; // Tu usuario de MySQL (por defecto es root)
    private static final String CLAVE = "admin"; // Tu contraseña (si usas XAMPP suele estar vacía)
    
    private static Connection conexion = null;

    // Método para obtener la conexión
    public static Connection getConexion() {
        try {
            if (conexion == null || conexion.isClosed()) {
                // Registrar el driver que acabas de descargar
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Establecer la conexión
                conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
                System.out.println("¡Conexión exitosa a la base de datos!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el Driver de MySQL. Verifica la carpeta Libraries.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conexion;
    }
    
    // Método para cerrar la conexión de forma segura
    public static void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}