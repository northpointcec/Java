package bitManipulation;

public class ClearBitsFromLsb {

    public static void main(String[] args) {

        int n = 53;
        int i = 3;
        int mask = ~((1 << (i + 1)) - 1);
        System.out.println(n & mask);
    }
}
