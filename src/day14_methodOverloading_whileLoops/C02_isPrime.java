package day14_methodOverloading_whileLoops;

public class C02_isPrime {
    public static void main(String[] args) {

        System.out.println(isPrime(43));
        System.out.println(isPrime(44));
        System.out.println(isPrime(59));

    }
    public static boolean isPrime(int number){
        int flag=0;

        for (int i = 2; i <number ; i++) {

            if(number % i == 0){
                flag++;
                break;
            }
        }

        if (number == 2){
            return true;
        }else if (flag==0){
            return true;
        }else {
            return false;

        }




    }


}
