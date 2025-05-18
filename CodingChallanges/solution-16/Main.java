/*
    Title: Sum from 1 up to n
    >> Write down a program that will take an integer(n) and will print sum from 1 up to n
    ## Test ##
    input: 4 output: 10   Tips:(1+2+3+4=10)
    input: 5 output: 15
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
            sum = sum + i;
        }
        System.out.println(sum);
    }
}