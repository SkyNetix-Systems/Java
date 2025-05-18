/*
    Title: Decimal to Binary
    >> Write down a program that will take a decimal number as input and will print the binary equivalent
    ## Test ##
    input: 3 output: 11
    input: 5 output: 101
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer:");
        num = scanner.nextInt();
        int remainder, i = 0;
        double binary = 0;
        while(num != 0) {
            remainder = num % 2;
            binary = binary + remainder * Math.pow(10,i);
            num = num / 2;
            i++;
        }
        System.out.println(binary);
    }
}