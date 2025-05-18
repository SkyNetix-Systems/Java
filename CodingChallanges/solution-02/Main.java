/*
    Title: Checking a number even or odd
    >> Write down a program that will take an integers as input and will check the given number is even or odd
    ## Test Case ##
    input: 6 output: even
    input: 7 output: odd
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer:");
        num = scanner.nextInt();
        if(num%2==0) {
            System.out.println("Even");
        }
        if(num%2==1) {
            System.out.println("Odd");
        }
    }
}