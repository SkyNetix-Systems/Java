/*
    Title: Perfect number testing
    >> Write down a program that will take an integer as input and
    >> will check the number is perfect number or not
    ## Test ##
    input: 10 output: false
    input: 6  output: true
    input: 28 output: true
 */

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer:");
        num = scanner.nextInt();
        System.out.println(is_perfect(num));
    }
    public static boolean is_perfect(int n) {
        int sum = 0;
        for(int i=1; i<=n/2; i++) {
            if(n%i==0) {
                sum = sum + i;
            }
        }
        return n == sum;
    }
}