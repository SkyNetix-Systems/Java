/*
    Title: Count digits of a number
    >> Write down a program that will take an integer as input and will count the digits of the given number
    ## Test ##
    input: 123  output: 3
    input: 8570 output: 4
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter an integer:");
        n = scanner.nextInt();
        int count = 0;
        while(n != 0) {
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}