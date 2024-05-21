package empleadooscar.proyecto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProyectoServiceOscar {
    @Autowired
    private ProyectoRepositoryOscar proyectoRepository;

    public List<ProyectoOscar> findAllOscar() {
        Iterable<ProyectoOscar> iterable = proyectoRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }
    public ProyectoOscar insert(ProyectoOscar proyecto) {
        return proyectoRepository.save(proyecto);
    }
}
