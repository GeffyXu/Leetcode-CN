public class Solution70 {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = a;
            a = b;
            b = c + a;
        }
        return b;
    }

    public static void main(String[] args) {
        Solution70 solution70 = new Solution70();
        System.out.print(solution70.climbStairs(3));
    }
}
