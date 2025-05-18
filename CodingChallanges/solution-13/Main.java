/*
    Title: GCD (Greatest Common Divisor)
    >> Write down a program that will take two integers as input and will
    >> find the gcd of them
    ## Test ##
    input: 2 4   output: 2
    input: 12 18 output:  6
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
        System.out.println(find_gcd(n1, n2));
    }
    /*public static int find_gcd(int num1, int num2) {
        int gcd = 0;
        for(int i=1; i<=num1&&i<=num2; i++) {
            if(num1%i==0 && num2%i==0) {
                gcd = i;
            }
        }
        return gcd;
    }*/
    public static int find_gcd(int num1, int num2) {
        while(num1 != num2) {
            if(num1>num2) {
                num1 = num1 - num2;
            }
            if(num2>num1) {
                num2 = num2 - num1;
            }
        }
        return num2;

        // gcd(n1, n2)
        // gcd(n1-n2, n2)  if n1>n2
        // gcd(n1, n2-n1)  if n2>n1
    }
}