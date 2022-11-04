package innerclass;

public class Access2 {

    class Inner2{
        public void m1() {
            System.out.println("This is inner class");
        }
    }
    public static void main(String[] args) {
        System.out.println("This is outer class");
    }
}
class call{
    
    public static void main(String[] args) {
       Access2 a = new Access2();
       Access2.Inner2 i = a.new Inner2();
       i.m1();
    }
}