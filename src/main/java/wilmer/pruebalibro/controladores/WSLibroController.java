package wilmer.pruebalibro.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wilmer.pruebalibro.modelos.WSLibro;
import wilmer.pruebalibro.servicios.WSLibroService;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class WSLibroController {
    private final WSLibroService wslibroService;

    @Autowired
    public WSLibroController(WSLibroService wslibroService) {
        this.wslibroService = wslibroService;
    }

    @GetMapping
    public ResponseEntity<List<WSLibro>> obtenerLibros() {
        List<WSLibro> wslibros = wslibroService.obtenerTodosLosLibros();
        return new ResponseEntity<>(wslibros, HttpStatus.OK);
    }
}
