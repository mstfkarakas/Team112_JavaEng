package day26_localTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {

        // we need two dates

        LocalDate birthDate = LocalDate.of(1982,5,4);
        LocalDate today = LocalDate.now();

        System.out.println(Period.between(birthDate, today)); // P40Y10M13D  // 40 years, 10 months, 13 days
        // Burdan sadece yili cekebiliriz. Kac tam yil gecti? :
        System.out.println(Period.between(birthDate, today).getYears()); // 40

        LocalDate anniversary = LocalDate.of(2016,4,16);
        System.out.println(Period.between(anniversary, today)); // P6Y11M1D : 6 years, 11 months and 1 day
        // Yil ve ayin ustune kac tam gun gecmis:
        System.out.println(Period.between(anniversary, today).getDays());  // 1




    }
}
