package domain;

import common.Comprobacion;
import common.EmailException;
import common.GeneradorDatos;
import lombok.*;

@Data
@Singleton
public class Abogado {

    private String idAbogado;
    private String nombreAbogado;
    private String direccionAbogado;
    private String telefonoAbogado;
    private String correoAbogado;

    public Abogado(String email) throws EmailException {
        this.idAbogado = GeneradorDatos.GenerarID();
        this.nombreAbogado = GeneradorDatos.GenerarNombres();
        this.direccionAbogado = GeneradorDatos.GenerarDireccion();
        this.telefonoAbogado = GeneradorDatos.GenerarTelefono();
        Comprobacion.EmailOk(email);
        this.correoAbogado = email;
    }

    public Abogado() {
        this.correoAbogado = "anonimo@gmail.com";
        this.telefonoAbogado = GeneradorDatos.GenerarTelefono();
    }

}
