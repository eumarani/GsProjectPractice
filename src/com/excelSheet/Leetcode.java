package com.excelSheet;

public class Leetcode {
    public static void main(String[] args) {
        int ht[]={1,8,6,2,5,4,8,3,7};
        int area=maxArea(ht);
        System.out.println(area);
    }

        public static int maxArea(int[] height) {
            int n =height.length;
            int ht=0,maxAr=0,area=0;
            int left=0,right=n-1;
            int width=0;
            while(left<right)
            {
                ht=Math.min(height[left],height[right]);
                width=right-left;
                 area=ht*width;
                maxAr=Math.max(maxAr,area);

                if(height[left]<height[right])
                {
                    left++;
                }
                else
                    right--;

            }
          
            return maxAr;

        }
    }

