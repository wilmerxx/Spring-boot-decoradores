package wilmer.pruebalibro.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wilmer.pruebalibro.modelos.WSLibro;
import wilmer.pruebalibro.repositorios.WSLibroRepository;

import java.util.List;

@Service
public class WSLibroServiceImpl implements WSLibroService{

    private final WSLibroRepository wslibroRepository;
    @Autowired
    public WSLibroServiceImpl(WSLibroRepository wslibroRepository) {
        this.wslibroRepository = wslibroRepository;
    }

    @Override
    public List<WSLibro> obtenerTodosLosLibros() {
        return this.wslibroRepository.obtenerTodosLosLibros();
    }
}
