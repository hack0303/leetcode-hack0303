package org.cland;

public class Case007 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = -123;
        System.out.println(solution.reverse(x));
    }

    /**
     * */
    static class Solution {
        public int reverse(int x) {
            if (x == 0) {
                return 0;
            }
            long store = 0;
            while (x != 0) {
                store = store * 10 + x % 10;
                x /= 10;
            }
            if (store > Math.pow(2, 31) - 1  || store < Math.pow(-2, 31)) {
                return 0;
            }
            return (int) store;
        }
    }

}
