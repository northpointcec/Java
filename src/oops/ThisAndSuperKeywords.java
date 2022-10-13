package oops;

class p {
     String  s= "Parent class";
}
class c extends p{
     String s = "Child class";
    public void demo() {
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);
    }
}
public class ThisAndSuperKeywords {

    public static void main(String[] args) {
        c c = new c();
        c.demo();
        
    }
}
