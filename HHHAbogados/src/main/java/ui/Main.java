package ui;

import domain.Abogado;
import domain.Sentencia;

public class Main {
    public static void main(String[] args) {

        Sentencia sentencia = new Sentencia();
        System.out.println(sentencia.getVeredicto());
        Abogado abogado= new Abogado();

        System.out.println(abogado.getTelefonoAbogado());

    }
}

