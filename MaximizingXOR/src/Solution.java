import java.util.*;

public class Solution {

    static int maxXor(int l, int r) {
        int max = 0;

        for (int i = l; i <= r; i++) {
            for (int j = l; j <= r; j++) {
                
                int current = i^j;
                if (current > max) {
                    max = current;
                }
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}