package Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 */
public class UniqueOccurrencesLC1207 {
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};//{1,2}
        System.out.println(uniqueOccurrences(arr));
    }

    private static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i :arr){
            //getOrDefault increments the count if the key already present with +1 given
            hmap.put(i, hmap.getOrDefault(i,0)+1);
        }
        Set<Integer> countSet = new HashSet<>(hmap.values());
        return hmap.size() == countSet.size();
    }
}
