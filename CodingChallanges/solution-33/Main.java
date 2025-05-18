/*
    Title: First recurring element in an array
    >> Write down a program that will find first recurring element in an array
    ## Test ##
    input: {1, 2, 3, 4, 3}        output: 3
    input: {1, 2, 3, 4, 3, 2, 3}  output: 2
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of an array:");
        size = scanner.nextInt();
        int nums[] = new int[size];
        for(int i=0; i<size; i++) {
            System.out.printf("Enter an integer for index %d=", i);
            nums[i] = scanner.nextInt();
        }
        System.out.println(first_recurring_element(nums));
    }
    public static int first_recurring_element(int nums[]) {
        int len = nums.length;
        for(int i=0; i<len; i++) {
            for(int j=i+1; j<len; j++) {
                if(nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}