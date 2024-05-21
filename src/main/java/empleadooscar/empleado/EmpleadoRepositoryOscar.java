package empleadooscar.empleado;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import jakarta.transaction.Transactional;

public interface EmpleadoRepositoryOscar extends CrudRepository<EmpleadoOscar, Long> {
    @Modifying
    @Transactional
    @Query("DELETE FROM EmpleadoOscar r WHERE r.nombre = ?1")
    void deleteByNombre(String nombreEmpleado);
}