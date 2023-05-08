package exceptionhandling;

public class FinalDemo3 {

    public static void main(String[] args) {
        System.out.println(m());
    }
    @SuppressWarnings("finally")
    public static int m() {
        try {
            return 777;
        }catch(Exception e ) {
            return 888;
        }finally {
            return 999;
        }
    }
}
