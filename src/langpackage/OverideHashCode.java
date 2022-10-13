package langpackage;

public class OverideHashCode {

    int no;
    public static void main(String[] args) {
        OverideHashCode obj1 = new OverideHashCode(10);
        OverideHashCode obj2 = new OverideHashCode(100);
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        
    }
    OverideHashCode( int no ){
        this.no = no;
    }
    public int hashCode() {
        return no;
    }
    public String toString() {
        return no+"";
    }
}
