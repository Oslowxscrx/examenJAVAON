package empleadooscar.proyecto;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoControllerOscar {
     @Autowired
    private ProyectoServiceOscar proyectoService;

    @GetMapping("/")
    public ResponseEntity<List<ProyectoOscar>> getAllProyectos() {
        List<ProyectoOscar> empleados = proyectoService.findAllOscar();
        return new ResponseEntity<>(empleados, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<ProyectoOscar> createEmployee(@RequestBody ProyectoOscar proyecto) {
        ProyectoOscar createProyecto = proyectoService.insert(proyecto);
        return new ResponseEntity<>(createProyecto, HttpStatus.CREATED);
    }


}
