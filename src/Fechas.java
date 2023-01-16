import java.time.DayOfWeek;
import java.time.Month;
import java.time.Period;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Calendar;

public class Fechas {

    public static void main(String[] args) {


        LocalDate hoy = LocalDate.now();
        LocalDate cumple = LocalDate.of(2004,Month.SEPTEMBER,9);
        Period p = Period.between(cumple, hoy);
        System.out.println("Tienes "+ p.getYears() +" años, " + p.getMonths() + " meses y " + p.getDays() + " días");

        System.out.println("Introduzca una fecha con el siguiente formato: AAAA-MM-DD");
        Scanner sc = new Scanner(System.in);

        String fechaIntroducida = sc.next();
        LocalDate fechaOriginal = LocalDate.parse(fechaIntroducida);

        System.out.println(fechaOriginal.getDayOfWeek());
        
        long Cien = ChronoUnit.DAYS.between(cumple, fechaOriginal);
        System.out.println(Cien);





    }
}
