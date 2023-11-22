package wilmer.pruebalibro.servicios;

import wilmer.pruebalibro.modelos.WSLibro;

import java.util.List;

public interface WSLibroService {
    List<WSLibro> obtenerTodosLosLibros();
}
