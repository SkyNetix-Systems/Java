/*
    Title: Average of first n numbers
    >> Write down a program that will take a number(n) as input and will print
    >> average of first n numbers
    ## Test ##
    input: 5  output: 3.0      [(1+2+3+4+5)/5=3]
    input: 10 output: 5.5      [(1+2+3+4+5+6+7+8+9+10)/10=5.5]
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
        float average = (float) sum / n;
        System.out.println("Average:"+average);
    }
}