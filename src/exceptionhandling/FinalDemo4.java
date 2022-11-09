package exceptionhandling;


public class FinalDemo4 {

    public static void main(String[] args) {
        try {
            System.out.println("hello");
            System.exit(0);
        }catch(Exception e ) {
            System.out.println("catch block");
        }finally {
            System.out.println("final block");
        }
    }
}
