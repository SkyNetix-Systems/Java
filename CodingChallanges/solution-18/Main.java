/*
    Title: Sum of all even numbers from 1 up to n
    >> Write down a program that will take an integer n as input and will print
    >> the addition of all even numbers up to n
    ## Test ##
    input: 5  output: 6     tips(2+4=6)
    input: 10 output: 30     tips(2+4+6+8+10=30)
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
            if(i%2==0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum:" + sum);
    }
}