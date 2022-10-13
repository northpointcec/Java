package langpackage;

public class ToString {

    String name;
    
    ToString(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        ToString a = new ToString("Ajay");
        ToString b = new ToString("Chaudhary");
        System.out.println(a);
        System.out.println(b);
    }
    public String toString() {
        return name;
    }
}
