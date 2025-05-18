/*
    Title: Most frequent
    >> Write down a program that will find the most frequent in an integer array
    ## Test ##
    input: {1, 2, 3, 4, 2, 2, 3}   output: 2
    input: {1, 2, 1, 3, 2, 3, 1}   output: 1
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
            System.out.printf("Enter integer for index %d= ", i);
            nums[i] = scanner.nextInt();
        }
        System.out.println(most_frequent(nums));
    }
    public static int most_frequent(int nums[]) {
        int len = nums.length;
        int mf = -1, maxCount = 0, i, j;
        for(i=0; i<len; i++) {
            int count = 0;
            for(j=i+1; j<len; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count>maxCount) {
                maxCount = count;
                mf = nums[i];
            }
        }
        if(mf==-1) {
            return -1;
        } else {
            return mf;
        }
    }
}
