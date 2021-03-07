package org.cland;

public class Case006 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String inStr = "P   A   H   N\n" +
                "A P L S I I G\n" +
                "Y   I   R";
        int numRows = 3;
        System.out.println(solution.convert(inStr, numRows));
    }

    /**
     * 从上往下，从左往右
     * 下0 - numrows,上[nomrows-n]右[numrows+n] 下。。。上。。。
     * 什么鬼东西，未解
     */
    static class Solution {
        public String convert(String s, int numRows) {
            char[][] charMap = new char[numRows][100];
            int positionX = 0;
            int positionY = 0;
            char now = charMap[positionY][positionX];
            String target = "";
            boolean isDown = true;
            int left = 0;
            do {
                target += now;
                if (isDown) {
                    //下
                    positionY++;
                } else {
                    //上
                    positionY--;
                    left++;
                    positionX += left;

                }
                if (positionY == numRows - 1) {
                    //触底向上
                    isDown = false;
                    left = 0;
                } else if (positionY == 0) {
                    isDown = true;
                }
                now = charMap[positionY][positionX];
            } while (now != '\32');
            return target;
        }
    }

}
