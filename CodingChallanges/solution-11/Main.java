/*
    Title: Summing array elements
    >> Write down a program that will takes an integer array as input and will
    >> print the summation of that array elements
    ## Test ##
    input: {1, 2, 3, 4, 5} output: 15
    input: {3, 5, 7, 9}    output: 24
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of an array:");
        size = scanner.nextInt();
        int[] nums = new int[size];
        for(int i=0; i<size; i++) {
            System.out.printf("Enter integer for index no %d:", i);
            nums[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i=0; i<size; i++) {
            sum = sum + nums[i];
        }
        System.out.println("Sum:" + sum);
    }
}