/*
    Title: Checking a number is a palindrome or not
    >> Write down a program that will check a number is a palindrome or not
    ## Test ##
    input: 121 output: true
    input: 123 output: false
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter an integer:");
        n = scanner.nextInt();
        System.out.println(is_palindrome(n));
    }
    public static boolean is_palindrome(int n) {
        int last_digit, reversed = 0, num = n;
        while(num != 0) {
            last_digit = num % 10;
            reversed = reversed * 10 + last_digit;
            num = num / 10;
        }
        return n == reversed;
    }
}