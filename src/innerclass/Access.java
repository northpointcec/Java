package innerclass;

public class Access {

    class Inner{
        public void m1() {
            System.out.println("This is inner class");
        }
    }
    
    public static void main(String[] args) {
        Access a = new Access();
        Access.Inner i = a.new Inner();
        i.m1();
        System.out.println("This is outer class");
        
    }
}
