package exceptionhandling;

public class Demo2 {

    public static void main(String[] args) {
        try {
            dostuff();
        }catch(Exception e) {
            System.out.println("program terminated normally");
        }
    }
    static void dostuff() {
        domorestuff();
    }
    static void domorestuff() {
        System.out.println(10/0);
    }
}
