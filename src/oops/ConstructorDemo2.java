package oops;

public class ConstructorDemo2 {

    String name ; 
    int rollno;
    ConstructorDemo2(String name , int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public static void main(String... args) {
        ConstructorDemo2 a = new ConstructorDemo2("Ajay" , 101);
        System.out.println(a.name);
        System.out.println(a.rollno);
        ConstructorDemo2 b = new ConstructorDemo2("Raj" ,102);
        System.out.println(b.name +"\n"+b.rollno);
    }
}
