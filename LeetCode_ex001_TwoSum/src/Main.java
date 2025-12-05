public class Main {
    public static void main(String[] args) {

        //Declare array of type int with fixed values
        int[] nums = {2, 7, 11, 15}; // --> example 1: target = 9
//        int[] nums = {3, 2, 4, 5}; // --> example 2: target = 6
//        int[] nums = {45, 3, 8, -12}; // --> example 3: target = -4
        //Declare variable n equal to nums.length
        int n = nums.length;
        //Loop through array nums from i = 0 to n, incrementing i by 1
        for (int i = 0; i < n; ++i) {
            //Inside this 'for', loop through array nums from j = i+1 to n, incrementing j by 1
            for (int j = i+1; j < n; ++j) {
                //Declare variable 'result' as the sum of i and j
                int result = nums[i] + nums[j];
                //Set the rule for calculating the target value
                if (result == 9) {
//                if (result == 6) { // --> example 2
//                if (result == -4) { // --> example 3
                    //Display the indices of the 2 numbers that add up to the value of the target
                    System.out.print("[" + i + ", " + j + "]");
                }
            }
        }
    }
}