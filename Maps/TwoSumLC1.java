package Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSumLC1 {
    public static void main(String[] args) {

        int target = 18;
        int[] input = {2,7,11,18};
        int[] output = twoSum(input, target);
       Arrays.stream(output).forEach(System.out::println);

    }

    private static int[] twoSum(int[] input, int target) {
        Map<Integer, Integer> logicMap = new HashMap<>();
        int[] output = new int[2];
        for(int i = 0; i <=input.length-1; i++){
            if(logicMap.containsKey(target - input[i])){ //Check if the difference already exists in the map
                output[0] = logicMap.get(target - input[i]);
                output[1] = i;
                return output;
            }
            logicMap.put(input[i],i);//Map with the actual and index to store
            System.out.println("logicMap "+logicMap);
        }
        return output;

        //Brute force
        /*
        int[] output = new int[2];
        for(int i= 0; i <= nums.length-1;i++){
            for(int j=0;j<=nums.length-1;j++){
                if(i != j){
                    if(nums[i]+nums[j]==target){
                        output[0]=i;
                        output[1]=j;
                        return output;
                    }
                }
            }
        }
        return output;
        */
    }
}
