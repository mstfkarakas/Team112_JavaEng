package day26_localTime_varargs;

import java.time.LocalDateTime;

public class C04_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2023-03-17T00:27:12.694993100
        System.out.println(ldt.toLocalDate()); // 2023-03-17    just the date without  the time.




    }
}
