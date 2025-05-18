/*
    Title: Sum of all odd numbers from 1 up to n
    >> Write down a program that will take an integer n as input and will print
    >> the addition of all odd numbers up to n
    ## Test ##
    input: 5  output: 9      tips(1+3+5=9)
    input: 10 output: 25     tips(1+3+5+7+9=25)
 */

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter an integer:");
        n = scanner.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i%2==1) {
                sum = sum + i;
            }
        }
        System.out.println("Sum:" + sum);
    }
}