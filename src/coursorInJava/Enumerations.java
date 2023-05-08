package coursorInJava;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerations {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        for( int i = 0; i<11; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration<Integer> e = v.elements();
        while(e.hasMoreElements()) {
            System.out.print(e.nextElement()+"  ");
        }
        System.out.println("\n"+v.getClass().getName());
        
        System.err.println("It is a legacy interface ");
    }
}
