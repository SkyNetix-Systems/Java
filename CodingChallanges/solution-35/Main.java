/*
    Title: Two sum
    >> Write down a program that will take an array of integers as input and return indices of
    >> two numbers such that they add up to a specific target. You may assume that each input would
    >> have exactly one solution and you may not use one element twice
    ## Test ##
    input: array = {2,7,11,15} target = 13    output: {0,2}
*/

package com.techbarik;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 18;
        int nums[] = twoSum(arr, target);
        for(int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    /*
    public static int[] twoSum(int arr[], int target) { // O(n^2)
        int len = arr.length;
        for(int i=0; i<len; i++) {
            for(int j=i+1; j<len; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No sum");
    } */
    public static int[] twoSum(int arr[], int target) { // O(n)
        Map<Integer, Integer> map = new HashMap<>();
        int len = arr.length;
        for(int i=0; i<len; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            } else {
                map.put(arr[i], i);
            }
        }
        throw new IllegalArgumentException("No sum");
    }
}