package domain;

import lombok.Data;

@Data
public class Cliente {

    private String idCliente;
    private String nombreCliente;
    private String direccionCliente;
    private int telefonoCliente;
    private String correoCliente;
    private Abogado abogado;

}
