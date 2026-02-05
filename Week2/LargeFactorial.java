import java.util.*;

class Solution {
    static ArrayList<Integer> factorial(int N) {

        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);

        for (int x = 2; x <= N; x++)
            multiply(x, res);

        Collections.reverse(res);
        return res;
    }

    static void multiply(int x, ArrayList<Integer> res) {

        int carry = 0;

        for (int i = 0; i < res.size(); i++) {
            int val = res.get(i) * x + carry;
            res.set(i, val % 10);
            carry = val / 10;
        }

        while (carry > 0) {
            res.add(carry % 10);
            carry /= 10;
        }
    }
}
