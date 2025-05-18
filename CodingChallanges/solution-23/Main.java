/*
    Title: Sum of digits
    >> Write down a program that will take an integer as input and will add digits of the given number
    ## Test ##
    input: 123  output: 6     tips(1+2+3=6)
    input: 8570 output: 20    tips(8+5+7+0=20)
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Enter an integer:");
		n= scanner.nextInt();
		int sum = 0, last_digit;
		while(n != 0) {
			last_digit = n % 10;
			sum = sum + last_digit;
			n = n / 10;
		}
		System.out.println("Sum:" + sum);
	}
}