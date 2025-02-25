package pe.edu.idat.app_transaccion_idat.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Table(name = "transaccion")
@Entity
public class TransaccionDto {
    private Integer id;
    private Integer cuentaorigenid;
    private Integer cuentadestinoid;
    private Double monto;
    private LocalDateTime fecha;
}
