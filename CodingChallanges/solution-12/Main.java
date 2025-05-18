/*
    Title: Factorial of a number
    >> Write down a program that will take an integer (number) as input and will
    >> find the factorial of the number
    ## Test ##
    input: 3 output: 6
    input: 4 output: 24
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter an integer:");
        n = scanner.nextInt();
        System.out.println(factorial(n));
    }
    /*public static int factorial(int num) {
        // using loop
        int fact = 1;
        for(int i=1; i<=num; i++) {
            fact = fact * i;
        }
        return fact;
    }*/
    public static int factorial(int num) {
        // using recursion
        if(num==1) {
            return 1;
        } else {
            return num * factorial(num-1);
        }
        // num=4
        // 24
        // 6
        // 2
    }
}