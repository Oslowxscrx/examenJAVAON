package empleadooscar.empleado;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EmpleadoServiceOscar {
    @Autowired
    private EmpleadoRepositoryOscar empleadoRepository;

    public List<EmpleadoOscar> findAllOscar() {
        Iterable<EmpleadoOscar> iterable = empleadoRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }

    public EmpleadoOscar insert(EmpleadoOscar entity) {
        return empleadoRepository.save(entity);
    }

    public void deleteByNombre(String nombreEmpleado) {
        empleadoRepository.deleteByNombre(nombreEmpleado);
    }
}
