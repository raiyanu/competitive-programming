import java.util.*;
import java.lang.*;
import java.io.*;


class Solution {
    public int[] runningSum(int[] nums) {
        int arrLength = nums.length, pivotSum=0;
        for (int i = 0; i<arrLength; i++ ) {
            // This line need to be removed before submission UwU
            System.out.println("nums[i] :" + nums[i] + " + pivotSum :" + pivotSum + " = "  + (nums[i] + pivotSum));
            pivotSum = nums[i] + pivotSum;
            nums[i] = pivotSum;
        }
        return nums;   
    }
}

// The main method must be in a class named "Main".
class Running-Sum-of-1D-Array{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Solution s = new Solution();
        System.out.println("Hello world!");
        int[] Result = s.runningSum(nums);
        for (int number : Result) {
            System.out.print(number);
        }
    }
}
