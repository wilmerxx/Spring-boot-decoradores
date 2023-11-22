package wilmer.pruebalibro.repositorios;

import org.springframework.stereotype.Repository;
import wilmer.pruebalibro.modelos.WSLibro;

import java.util.Arrays;
import java.util.List;

@Repository
public class WSLibroRepositoryImpl implements WSLibroRepository{

    @Override
    public List<WSLibro> obtenerTodosLosLibros() {
        return Arrays.asList(
                new WSLibro(1L, "Spring in Action", "Craig Walls"),
                new WSLibro(2L, "Clean Code", "Robert C. Martin")
        );
    }
}
