package dao;

import domain.*;
import lombok.Data;

import java.util.Map;
import java.util.TreeMap;

@Data
public class DaoHHM {

    private Map<String, Abogado> abogados;
    private Map<String, Cliente> clientes;
    private Map<String, Juez> jueces;
    private Map<String, Juicio> juicios;
    private Map<String, Sentencia> sentencias;

    public DaoHHM() {
        clientes = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            Abogado abogado = new Abogado();
            abogados.put(abogado.getIdAbogado(), abogado);
        }



    }


}
