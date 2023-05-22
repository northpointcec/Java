package string;

public class RabinKarp {
    public static void main(String[] args) {
        String txt = "aabaacaadaabaaba";
        String pat = "caa";
        System.out.println(search(txt, pat));
    }
    static final int d = 256;
    static final int q = 999999937;
    static boolean search(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        int h = 1;
        
        for(int i = 1; i<=m-1; i++) {
            h = (h*d)%q;
        }
        
        int p = 0, t = 0;
        
        for(int i = 0; i<m; i++) {
            p = (p*d + pat.charAt(i))%q;
            t = (t*d + txt.charAt(i))%q;
        }
        
        for(int i = 0; i<=n-m; i++) {
            if(p==t) {
                boolean flag = true;
                for(int j = 0; j<m; j++) {
                    if(txt.charAt(i+j) != pat.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if(flag == true) {
                    return true;
                }
            }
            if(i < (n-m)) {
                t = ( d*( t - txt.charAt(i)*h) + txt.charAt(i+m))%q;
                if(t<0) {
                    t = t+q;
                }
            }
        }
        return false;
    }
}
