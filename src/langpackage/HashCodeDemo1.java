package langpackage;

public class HashCodeDemo1 {
    
    int no;
    HashCodeDemo1(int no){
        this.no = no;
    }

    public static void main(String... args) {
        HashCodeDemo1 d = new HashCodeDemo1(10);
        HashCodeDemo1 d1 = new HashCodeDemo1(100);
        System.out.println(d);
        System.out.println(d1);
    }
    public int hashCode() {
        return no;
    }
}
