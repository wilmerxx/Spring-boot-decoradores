package wilmer.pruebalibro.repositorios;

import wilmer.pruebalibro.modelos.WSLibro;

import java.util.List;

public interface WSLibroRepository {
     List<WSLibro> obtenerTodosLosLibros();
}
