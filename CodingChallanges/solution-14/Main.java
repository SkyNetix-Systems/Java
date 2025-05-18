/*
    Title: Prime number testing
    >> Write down a program that will take a number as input and
    >> will check the given number is prime number or not
    ## Test ##
    input: 8  output: false
    input: 11 output: true
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter an integer:");
        n = scanner.nextInt();
        System.out.println(is_prime(n));
    }
    public static boolean is_prime(int n) {
        int check = -1;
        for(int i=2; i<=n/2; i++) {
            if(n%i==0 && n != 2) {
                check = i;
            }
        }
        if(check == -1) {
            return true;
        } else {
            return false;
        }
    }
}