import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Running_Sum_of_1D_Array {
    public static int[] runningSum(int[] nums) {
        int arrLength = nums.length, pivotSum=0;
        for (int i = 0; i<arrLength; i++ ) {
            // This line need to be removed before submission UwU
            System.out.println("nums[i] :" + nums[i] + " + pivotSum :" + pivotSum + " = "  + (nums[i] + pivotSum));
            pivotSum = nums[i] + pivotSum;
            nums[i] = pivotSum;
        }
        return nums;   
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println("Hello world!");
        int[] Result = runningSum(nums);
        for (int number : Result) {
            System.out.print(number);
        }
    }
}
