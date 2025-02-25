package pe.edu.idat.app_transaccion_idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.app_transaccion_idat.model.Transaccion;

public interface TransaccionRepository extends JpaRepository<Transaccion,Integer> {
}
