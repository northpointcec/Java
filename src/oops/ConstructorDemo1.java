package oops;

public class ConstructorDemo1 {

    String name ;
    ConstructorDemo1(String name){
        this.name = name;
    }
    
    public String toString() {
        return name ;
    }
    public static void main(String... args) {
       ConstructorDemo1  a = new ConstructorDemo1("Ajay");
       System.out.println(a);
       System.out.println(a.toString());
      
    }

   
}
