package langpackage;

public class Myequal {

    String name ; 
    int rollno;
    Myequal(String name , int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public boolean equals(Object obj) {
        String name = this.name;
        int rollno = this.rollno;
        Myequal m = (Myequal)obj;
        String name1 = m.name;
        int rollno1 = m.rollno;
        try {
        if(name.equals(name1) && rollno == rollno1) {
            return true;
        }else {
            return false;
        }
        
      }catch(ClassCastException e) {
          return false;
      }catch (NullPointerException e) {
          return false;
      }
        
    }
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        Myequal m1 = new Myequal("ajay", 101);
        Myequal m2 = new Myequal("raj" , 102);
        Myequal m3 = new Myequal("ajay" , 101);
        Myequal m4 = m1;
        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
        System.out.println(m1.equals(m4));
        System.out.println(m1.equals("ajay"));
        System.out.println(m1.equals(null));
    }
}
