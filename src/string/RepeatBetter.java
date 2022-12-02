package string;

public class RepeatBetter {

    public static void main(String[] args) {
        String str = "UpkYVLakIlrJHpnKnJlHlFyJiQTtumVmDARllqqnffOKkEJMuyAqlDEGblpdGSIpnPSgkMiTn";
        System.out.println(repeat(str));
    }
    static String repeat(String str) {
        int[] arr = new int[256];
        for( int i = 0; i<str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        for( int i = 0; i<str.length() ; i++) {
            if(arr[str.charAt(i)] >1) {
                return str.charAt(i) + "";
            }
        }
        return "-1";
    }
}
