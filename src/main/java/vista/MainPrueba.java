package vista;

import controlador.ConexionDB;
import java.sql.Connection;

public class MainPrueba {
    
    public static void main(String[] args) {
        System.out.println("Iniciando prueba de conexión...");
        
        // Llamamos al método que creaste en ConexionDB
        Connection conexion = ConexionDB.getConexion();
        
        // Verificamos si la conexión no es nula (es decir, si tuvo éxito)
        if (conexion != null) {
            System.out.println("¡Todo está configurado correctamente! Listo para continuar.");
            
            // Cerramos la conexión para no dejarla abierta consumiendo memoria
            ConexionDB.cerrarConexion();
        } else {
            System.out.println("Hubo un fallo al conectar. Revisa tus credenciales o si MySQL está encendido.");
        }
    }
}