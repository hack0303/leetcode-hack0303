package org.cland;

public class Case004 {

    public static void main(String[] args){
       Solution solution=new Solution();
       int[] nums1={1,2};
       int[] nums2={3};
       System.out.println(solution.findMedianSortedArrays(nums1,nums2));
    }

    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int length=nums1.length+nums2.length;
            int[] sortedArray=new int[length];
            for(int x=0;x<nums1.length;x++){
                sortedArray[x]=nums1[x];
            }
            for(int x=0;x<nums2.length;x++){
                int key=nums2[x];
                int beforeIndex=nums1.length-1+x;
                while(beforeIndex>=0&&sortedArray[beforeIndex]>key){
                    sortedArray[beforeIndex+1]=sortedArray[beforeIndex];
                    beforeIndex-=1;
                }
                sortedArray[beforeIndex+1]=key;
            }
            int middle=(0+length-1)/2;
            //判断奇偶
            double target=0d;
            if(length%2==1){
                target=(double)sortedArray[middle];
            }
            if(length%2==0){
                target=(sortedArray[middle]+sortedArray[middle+1])/2d;
            }
            return target;
        }
    }
}
