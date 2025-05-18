/*
    Title: find min, max of two numbers
    >> Write down a program that will takes two number as input and
    >> find min and max using ternary operator
    ## Test ##
    input: 1 2 output: Min= 1 Max= 2
    input: 6 5 output: Min= 5 Max= 6
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter two integers:");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        int min = n1 > n2 ? n2 : n1;
        int max = n1 > n2 ? n1 : n2;
        System.out.println("Min=" + min + " Max=" + max);
    }
}