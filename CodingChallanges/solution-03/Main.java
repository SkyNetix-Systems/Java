/*
    Title: Find area of a circle
    >> Write down a program that will take radius of a circle and calculate area of the circle
    ## Test Case ##
    input: 6.2 output: 120.763
    input: 7.5 output: 176.715
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        float radius = scanner.nextFloat();
        double area = 3.1416 * radius * radius;
        System.out.printf("%.3f", area);
    }
}
