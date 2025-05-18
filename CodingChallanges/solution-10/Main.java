/*
    Title: Distance between two points
    >> Write down a program that will take two points of a straight line as input and
    >> will find the distance between two points formula: distance = sqrt of (x2-x1)^2+(y2-y1)^2
    ## Test ##
    input: x1=1, y1=2, x2=3, y2=3  output: 2.236
    input: x1=2, y1=2, x2=5, y2=5  output: 4.243
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1, y1, x2, y2;
        System.out.println("x1=");
        x1 = scanner.nextFloat();
        System.out.println("y1=");
        y1 = scanner.nextFloat();
        System.out.println("x2=");
        x2 = scanner.nextFloat();
        System.out.println("y2=");
        y2 = scanner.nextFloat();
        float side1 = x2 - x1;
        float side2 = y2 - y1;
        double distance = Math.sqrt(side1*side1 + side2*side2);
        System.out.printf("%.3f", distance);
    }
}