package common;

import net.datafaker.Faker;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class GeneradorDatos {

    static Faker faker = new Faker();

    public static String GenerarNombres() {
        return faker.name().firstName();
    }

    public static String GenerarDireccion() {
        return faker.address().fullAddress();
    }

    public static String GenerarTelefono() {
        return faker.phoneNumber().phoneNumberNational();
    }

    public static String GenerarID() {
        int random = (int) (Math.random() * 100000) + 1;
        return String.valueOf(random);
    }

    public static LocalDate GenerarFechaFinal() {
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        long randomDays = faker.random().nextLong(daysBetween + 1);
        LocalDate randomDate = startDate.plusDays(randomDays);
        return randomDate;
    }

    public static LocalDate GenerarFechaInicial() {
        LocalDate startDate = LocalDate.of(2008, 1, 1);
        LocalDate endDate = LocalDate.of(2022, 12, 31);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        long randomDays = faker.random().nextLong(daysBetween + 1);
        LocalDate randomDate = startDate.plusDays(randomDays);
        return randomDate;
    }

    public static String GenerarVeredicto() {
        String[] veredictos = {"Culpable", "Inocente"};
        int indiceAleatorio = new Random().nextInt(veredictos.length);
        return veredictos[indiceAleatorio];
    }

}
