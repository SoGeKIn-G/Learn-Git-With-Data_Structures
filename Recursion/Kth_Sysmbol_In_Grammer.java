//https://leetcode.com/problems/k-th-symbol-in-grammar/
//leetcode

public class Kth_Sysmbol_In_Grammer {
    public static void main(String[] args) {
        int n = 2, k = 2;
        int ans = solve_Kth_Sysmbol(n, k);
        System.out.println(ans);

    }

    private static int solve_Kth_Sysmbol(int n, int k) {
        if (n == 1 && k == 1) {
            return 0;
        }

        int mid = (int) Math.pow(2, n - 1) / 2;
        if (k <= mid) {
            return solve_Kth_Sysmbol(n - 1, k );
        } else
            return solve_Kth_Sysmbol(n - 1, k - mid)^1;

    }
}
