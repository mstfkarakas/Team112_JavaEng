package day29_inheritance;

public class C05_Child extends C03_ParentClass{

    int c = 20;
    int a;

    String s = "Child class";
    String m;

    public void method1() {
        System.out.println("Child Class Method1");
    }

    public static void main(String[] args) {

        C05_Child obj = new C05_Child();
        System.out.println(obj.a); // 0
        System.out.println(obj.c); // 20
        System.out.println(obj.b); // 0
        System.out.println(obj.m); // null
        System.out.println(obj.s); // Child class
        System.out.println(obj.t); // null
        obj.method1(); // Child Class Method1
        obj.method2(); // Parent Method2 calisti.

    }
}
