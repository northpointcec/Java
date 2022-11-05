package innerclass;

public class Nesting {

    public static void main(String[] args) {
        new A().new B().new C().new D().new E().m1();
        System.err.println("I am fine dude.");
        
    }
}
class A{
    class B{
        class C{
            class D{
                class E{
                    public void m1() {
                        System.out.println("Hello! how are you ajay?");
                    }
                }
            }
        }
    }
}
