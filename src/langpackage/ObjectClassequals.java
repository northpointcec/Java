package langpackage;

public class ObjectClassequals {

    String name ;
    int rollno;
    ObjectClassequals(String name  , int rollno){
        this.name = name ;
        this.rollno = rollno;
    }
    public static void main(String[] args) {
        ObjectClassequals s1 = new ObjectClassequals("ajay" , 101);
        ObjectClassequals s2 = new ObjectClassequals("raj" , 102);
        ObjectClassequals s3 = new ObjectClassequals("ajay", 101);
        ObjectClassequals s4 = s1;
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
