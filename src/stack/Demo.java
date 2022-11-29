package stack;

public class Demo {

    public static void main(String[] args) {
        Twostacks sq = new Twostacks();
        stacks s = new stacks();
        s.push1(10, sq);
        System.out.println(s.pop1(sq));
        
    }
}
class Twostacks{
    int[] arr;
    int top1, top2;
    final int cap = 100;
    Twostacks(){
        arr = new int[cap];
        top1 = -1;
        top2 = cap;
    }
}
class stacks{
    
    void push1( int data, Twostacks sq) {
        if(sq.top1 < sq.top2-1) {
            sq.top1++;
            sq.arr[sq.top1] = data;
            
        }
        
    }
    int pop1(Twostacks sq) {
        if(sq.top1 == -1) {
            return -1;
        }
        int a = sq.arr[sq.top1];
        sq.top1--;
        return a;
    }
}
