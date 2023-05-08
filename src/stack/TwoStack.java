package stack;

public class TwoStack {

    public static void main(String[] args) {
        stack s = new stack(10);
        s.push1(10);
        s.push1(20);
        s.push1(30);
        s.push1(40);
        s.push1(50);
        s.push2(100);
        s.push2(90);
        s.push2(80);
        s.push2(70);
        s.push2(60);
        System.out.println(s.size1());
        System.out.println(s.size2());
        System.out.println(s.push1(0));
        System.out.println(s.push2(0));
        System.out.println(s.pop1());
        System.out.println(s.pop1());
        System.out.println(s.pop1());
        System.out.println(s.pop1());
        System.out.println(s.pop1());
        System.out.println(s.pop1());
        System.out.println(s.pop2());
        System.out.println(s.pop2());
        System.out.println(s.pop2());
        System.out.println(s.pop2());
        System.out.println(s.pop2());
        System.out.println(s.pop2());
        
        
    }

}
class stack{
    int[] arr ;
    int cap, top1, top2 ;
    stack(int cap){
        this.cap = cap;
        arr = new int[cap];
        top1 = -1;
        top2 = cap;
    }
     boolean push1(int data) {
        if(top1 < top2-1) {
            top1++;
            arr[top1] = data;
            return true;
        }
        return false;
    }
     boolean push2(int data) {
         if(top1<top2-1) {
             top2--;
             arr[top2] = data;
             return true;
         }
         return false;
     }
     int pop1() {
         if(top1 == -1) {
             return -1;
         }
         int a = arr[top1];
         top1--;
         return a;
     }
     int pop2() {
         if(top2 == cap) {
             return -1;
         }
         int a = arr[top2];
         top2++;
         return a;
     }
     int size1() {
         return top1+1;
     }
     int size2() {
         return cap-top2;
     }
}