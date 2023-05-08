package exceptionhandling;

public class FinalDemo1 {

    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch(Exception e) {
            System.out.println("Arithmetic Exception");
        }finally {
            System.out.println("This is finally block");
        }
    }
}
