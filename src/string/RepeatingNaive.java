package string;

public class RepeatingNaive {

    public static void main(String[] args) {
        String str = "UpkYVLakIlrJHpnKnJlHlFyJiQTtumVmDARllqqnffOKkEJMuyAqlDEGblpdGSIpnPSgkMiTn";
        System.out.println(repeat(str));
    }
    static String repeat(String str) {
        for( int i = 0; i<str.length() ; i++) {
            for( int j = i+1; j<str.length() ; j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    return str.charAt(i)+"";
                }
            }
        }
        return "-1";
    }
}
