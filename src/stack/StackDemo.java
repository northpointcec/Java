package stack;

public class StackDemo {

    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(0);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        
    }
}
class MyStack{
    int top;
    int cap;
    int[] arr;
    MyStack(int cap){
        top = -1;
        this.cap = cap;
        arr = new int[cap];
                
    }
    void push(int data) {
        if(top >= (cap-1)) {
            System.err.println("Stack is Full");
            return;
        }
        top++;
        arr[top] = data;
    }
    int peek() {
        if(top == -1) {
            System.err.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }
    int size() {
        return top+1;
    }
    boolean isEmpty() {
        return (top == -1);
    }
    int pop() {
        if(top == -1) {
            System.err.println("Stack is Empty");
            return -1;
        }
        int a = arr[top];
        top--;
        return a;
    }
}
