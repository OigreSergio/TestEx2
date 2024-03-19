import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

/*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
Ottieni l'anno
Ottieni il mese
Ottieni il giorno
Ottieni il giorno della settimana
Stampa i risultati sulla console -Crea dei test per questo esercizio*/
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int yearInfo = yearMethodh(data);

        Month monthInfo = monthMethodh(data);

        int dayOfMontInfo = dayOfMonthMethodh(data);

        DayOfWeek dayOfWeekInfo = dayOfWeek(data);

        System.out.println(yearInfo);

        System.out.println(monthInfo);

        System.out.println(dayOfMontInfo);

        System.out.println(dayOfWeekInfo);

    }

    public static int yearMethodh(OffsetDateTime dataTime) {
        return dataTime.getYear();
    }

    public static Month monthMethodh(OffsetDateTime dataTime) {
        return dataTime.getMonth();
    }

    public static int dayOfMonthMethodh(OffsetDateTime dataTime) {
        return dataTime.getDayOfMonth();
    }

    public static DayOfWeek dayOfWeek(OffsetDateTime dataTime) {
        return dataTime.getDayOfWeek();
    }
}
