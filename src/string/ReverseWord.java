package string;

public class ReverseWord {

    public static void main(String[] args) {
        String s = "Hello Ajay";
        char[] d = s.toCharArray();
        Reverse.reverseWord(d);
        System.out.println(d);
     
    }
}
class Reverse{
    static void reverseWord(char[] a) {
     int low = 0; 
     int end = a.length-1;
     for( int i = 0; i<end; i++) {
         if(a[i] ==' ') {
             reverse(a , low , i-1);
             low = i+1;
         }
     }
     reverse(a , low , end);
     reverse(a , 0 ,end);
    }
    static void reverse(char[] a , int low , int high) {
        while(low<high) {
            char temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
            
        }
        return;
    }
}
