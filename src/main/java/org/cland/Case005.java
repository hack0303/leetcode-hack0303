package org.cland;

public class Case005 {

    public static void main(String[] args){
       Solution solution=new Solution();
       String inStr="abcdb";
       //String inStr="ccc"; 这个居然结果要是ccc，不支持
       System.out.println(solution.longestPalindrome(inStr));
    }

    /**
     * 方法1：暴力求解
     * 方法2:滑动窗口
     * 方法3:索引
     * */
    static class Solution {
        public String longestPalindrome(String s) {
               int maxLen=0;
               int start=-1;
               int end=-1;
               char[] chars=s.toCharArray();
            for(int x=0;x<s.length();x++){
               int lastIndex=s.length()-1;
               if(x!=lastIndex){
                   lastIndex=s.indexOf(chars[x],x+1);
               }
               int now=lastIndex-x+1;
               if(now>maxLen){
                   maxLen=now;
               }else{
                   continue;
               }
               start=x;
               end=lastIndex;
            }
            return s.substring(start,end+1);
        }
    }

    /*
    错误的从左往右照
    static class Solution {
        public String longestPalindrome(String s) {
            int maxLen=0;
            int start=-1;
            int end=-1;
            for(int x=0;x<s.length();x++){
                int lastIndex=s.lastIndexOf(s.charAt(x));
                int now=lastIndex-x+1;
                if(now>maxLen){
                    maxLen=now;
                }else{
                    continue;
                }
                start=x;
                end=lastIndex;
            }
            return s.substring(start,end+1);
        }
    }
    */
}
