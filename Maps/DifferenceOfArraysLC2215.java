package Maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.
Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
 */
public class DifferenceOfArraysLC2215 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};

        System.out.println("Final list is "+findDifference(nums1, nums2));
    }

    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> finalList = new ArrayList();
        Set<Integer> firstSet = new HashSet();
        Set<Integer> secondSet = new HashSet();
        List<Integer> thirdList = new ArrayList();
        List<Integer> fourthList = new ArrayList();
        for(int i:nums1){
            firstSet.add(i);
        }
        for(int i:nums2){
            secondSet.add(i);
        }

        for(int i:firstSet){
            if(!secondSet.contains(i))
                thirdList.add(i);
        }
        for(int i:secondSet){
            if(!firstSet.contains(i))
                fourthList.add(i);
        }
        finalList.add(thirdList);
        finalList.add(fourthList);
        return finalList;
    }
}
