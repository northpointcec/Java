package langpackage;

public class EqualsVsdoubleequals {

    public static void main(String[] args) {
        String s1 = new String("Ajay");
        String s2 = new String("Ajay");
        System.out.println(s1==s2);
        //in this case String equals method is called
        // which is overridden and used for content comparison
        System.out.println(s1.equals(s2));
        
        StringBuffer sb1 = new StringBuffer("Ajay");
        StringBuffer sb2 = new StringBuffer("Ajay");
        System.out.println(sb1==sb2);
        // in this case Object class equals method is called
        // which is meant for address or reference comparison
        System.out.println(sb1.equals(sb2));
    }
}
