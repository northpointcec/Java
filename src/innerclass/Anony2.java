package innerclass;

public class Anony2 {

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        for( int i = 0; i<10; i++) {
            System.out.println("main Thread");
        }
    }
}
class MyRunnable implements Runnable{
    public void run() {
        for(int i = 0; i<10; i++) {
            System.out.println("child Thread");
        }
    }
}