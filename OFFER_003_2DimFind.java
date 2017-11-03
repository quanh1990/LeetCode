package com.leetcode.stitch;

public class OFFER_003_2DimFind {
    
    public static void main(String[] args) {
        
        int[][] arr = {{1,2,8,9},
                      {2,4,9,12},
                      {4,7,10,13},
                      {6,8,11,15}};
        
        System.out.println(In2Dim(arr, 3));
        
    }
    
    public static boolean In2Dim(int[][] nums, int target) {
        
        /*
         * 有一个二维数组其每一行从左到右依次递增，每一列从上到下依次递增，
         * 请完成这样一个函数传入这样一个数组和一个数，判断数组是否含有这个数，
         * 如果有返回true，如果没有返回false。
         * */
        
        // 找到二位数据右上角的数字
        int i = 0;
        int j = nums[0].length-1;
        
        // 开始比较，如果target比这个数大，那么target一定不能在当前行，
        // 如果target比这个数小，则不在当前列
        while(i < nums.length && j >= 0) {
            
            System.out.println("查询到 " + i + " " + j + ": " + nums[i][j]);
            if(target == nums[i][j]) return true;
            if(target > nums[i][j]) i++; 
            else j--;  // 这里注意要用else 如果还用if() 的形式 i++之后会出现数组下标越界
        }
        
        return false;

    }
}
