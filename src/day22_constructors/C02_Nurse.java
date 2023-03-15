package day22_constructors;

public class C02_Nurse {

    String name;
    String surname;
    String address;
    String tel;
    int age;
    boolean onVacation;
    char isMarried;
    int perHourSalary;

    public int calcOfSalary (int hour) {

        return hour*perHourSalary;
    }




}
