package empleadooscar.proyecto;

import lombok.Data;
import java.sql.Date;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import empleadooscar.empleado.EmpleadoOscar;

@Entity
@Data
public class ProyectoOscar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreProyecto;
    private Integer presupuesto;
    private Date fecha;
    private Boolean estado;

    @ManyToOne
    private EmpleadoOscar empleadoOscar;

}
