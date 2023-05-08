package innerclass;

public class Anony {

    public static void main(String[] args) {
        Popcorn p = new Popcorn() {
            public void taste() {
                System.out.println("spicy");
            }
        };
        p.taste();
        Popcorn p1 = new Popcorn();
        p1.taste();
        Popcorn p2 = new Popcorn() {
            public void taste() {
                System.out.println("sweet");
            }
        };
        p2.taste();
    }
}
class Popcorn{
    public void taste() {
        System.out.println("salty");
    }
}