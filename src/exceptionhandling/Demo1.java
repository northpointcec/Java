package exceptionhandling;

public class Demo1 {

    public static void main(String[] args) {
        dostuff();
        
    }
    static void dostuff() {
        domorestuff();
    }
    static void domorestuff() {
        System.out.println(10/0);
    }
}
