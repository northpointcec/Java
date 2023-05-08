package innerclass;

public class Access1 {

    class Inner1{
        public void m1() {
            System.out.println("This is inner class");
        }
    }
    public void m2() {
        Inner1 i = new Inner1();
        i.m1();
    }
    public static void main(String[] args) {
       Access1 a = new Access1();
       a.m2();
       System.out.println("This is outer class");
    }
}
