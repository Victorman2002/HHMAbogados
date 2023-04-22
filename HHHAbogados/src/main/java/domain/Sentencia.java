package domain;

import common.GeneradorDatos;
import lombok.Data;

import java.util.Date;

@Data
public class Sentencia {

    private String idSentencias;
    private Date fechaInicioSentencia;
    private Date fechaFinalSentencia;
    private String veredicto;

    public Sentencia() {
        this.veredicto = GeneradorDatos.GenerarVeredicto();
    }


}
