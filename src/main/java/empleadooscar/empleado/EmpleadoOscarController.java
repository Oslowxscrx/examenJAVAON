package empleadooscar.empleado;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody; // Importación correcta de @RequestBody
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoOscarController {
    @Autowired
    private EmpleadoServiceOscar empleadoService;

    @GetMapping("/")
    public ResponseEntity<List<EmpleadoOscar>> getAllEmpleados() {
        List<EmpleadoOscar> empleados = empleadoService.findAllOscar();
        return new ResponseEntity<>(empleados, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<EmpleadoOscar> createEmployee(@RequestBody EmpleadoOscar employee) {
        EmpleadoOscar createdEmployee = empleadoService.insert(employee);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }

    @DeleteMapping("/{nombre}/")
    public ResponseEntity<Void> deleteEmpleadoByNombre(@PathVariable String nombre) {
        empleadoService.deleteByNombre(nombre);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
