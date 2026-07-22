package interfaces;

import java.util.List;

public interface OperacionesCRUD<T> {
    boolean registrar(T objeto);
    boolean modificar(T objeto);
    boolean eliminar(String id);
    List<T> listar();
}