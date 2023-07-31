package Random;
/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
Input: nums = [4,1,2,1,2]
Output: 4
 */
public class SingleNumberLC136 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2,1,2};
        int singleNumber = singleNumber(nums1);
        System.out.println("singleNumber in an array is "+singleNumber);
    }

    private static int singleNumber(int[] nums1) {

        /*Using Bit Manipulation -

                As we know XOR operation with 0 gives the same number
        i.e, a XOR 0 = a
        eg, for decimal no. 2=> 2 XOR 0 = 2
        in binary, 010 XOR 000 = 010

        Also we know that , XOR operation with same number gives 0
        i.e, a XOR a = 0
        eg, 2 XOR 2 = 0
        in binary, 010 XOR 010 = 000

        XOR is associative (like sum)
        i.e, (2 XOR 3) XOR 4 = 2 XOR (3 XOR 4), So the order doesn't matter in performing XOR operation.
        eg, 2^3^4^6 = 3^2^6^4 = 4^2^6^3 ......*/

        int result = 0;
        for(int i : nums1) {
            System.out.println("result "+result+" i is "+i);
            result ^= i;
            System.out.println("result "+result);
        }
        return result;

        /*Other approach using Map
        Map<Integer, Integer> hmap = new HashMap();
        for(int i =0; i <= nums.length - 1; i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        System.out.println("hmap "+hmap);
        for(Integer s:hmap.keySet()){
            if(hmap.get(s)==1)
                return s;
        }
        return 0;
         */
    }
}
