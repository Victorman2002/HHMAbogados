package domain;

import lombok.Data;

import java.time.Duration;
import java.time.LocalDate;

@Data
public class Juicio {

    private String idJuicio;
    private LocalDate fechaInicioJuicio;
    private LocalDate fechaFinalJuicio;
    private Juez juez;
    private Cliente cliente;
    private String ganador;
    private double duracion;

    public void calcularDuracion() {
        Duration duration = Duration.between(this.fechaInicioJuicio.atStartOfDay(), fechaFinalJuicio.atStartOfDay());
    }

}
