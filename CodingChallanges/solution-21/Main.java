/*
    Title: Reverse a number
    >> Write down a program that will take an integer as input and will print
    >> the number in reverse order
    input: 123 output: 321
    input: 846 output: 648
 */

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter an integer:");
        n = scanner.nextInt();
        int last_digit, reversed = 0;
        while(n != 0) {
            last_digit = n % 10;
            reversed = reversed * 10 + last_digit;
            n = n / 10;
        }
        System.out.println("Reversed:" + reversed);
    }
}