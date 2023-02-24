package day11_stringManipulations_forLoops;

public class C08_Question {
    public static void main(String[] args) {
        //Question 4 : Ask the user for a password,
        // check the following terms and tell the user any missing terms that need to be corrected,
        // if it satisfies all conditions, print "password saved successfully"

        // - the first letter must be lowercase
        // - the last character must be a number
        // - the password must not contain spaces
        // - the length must be at least 10 characters

        int flag =0;
        String password = "tafsdfasdf423";

        // the first letter must be lowercase
        if ( password.charAt(0)>='a'&& password.charAt(0)<='z'){
            flag++; // flag = flag +1;
        }else {
            System.out.println("the first letter must be lowercase");
        }

        //the last character must be a number
            int lastCharIndex = password.length()-1;
        if (password.charAt(lastCharIndex)>= '0' && password.charAt(lastCharIndex)<= '9') {
            flag++;
        }else {
            System.out.println("the last character must be a number");
        }

        //the password must not contain spaces
        if (!password.contains(" ")){
            flag++;
        }else {
            System.out.println("the password must not contain spaces");
        }

        //the length must be at least 10 characters
        if (password.length()>=10){
            flag++;
        }else {
            System.out.println("the length must be at least 10 characters");
        }


        if (flag==4){
            System.out.println("password saved successfully");
        }

    }
}
