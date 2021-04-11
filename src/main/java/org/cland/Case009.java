package org.cland;

public class Case009 {
    public static void main(String[] args) {
        int test01 = 121;
        int test02 = 1234;
        int test03 = 10;
        int test04 = -121;
        System.out.printf("%s,%s,%s,%s%n", isPalindrome(test01), isPalindrome(test02), isPalindrome(test03), isPalindrome(test04));
    }

    public static boolean isPalindrome(int x) {
        String strX = String.valueOf(x);
        char[] charArray = strX.toCharArray();
        int len = strX.length();
        for (int index = 0; index < len; index++)
            if (charArray[index] != charArray[len - 1 - index]) {
                return false;
            }
        return true;
    }
}
