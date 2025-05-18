/*
    Title: Second largest of three numbers
    >> Write down a program that will find second largest of three numbers using ternary operator
    ## Test ##
    input: 1 2 3 output: 2
    input: 5 9 3 output: 5
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("Enter three integers:");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        int sc = n1>n2&&n1>n3 ? n2>n3?n2:n3 : n2>n1&&n2>n3 ? n1>n3?n1:n3 : n1>n2?n1:n2;
        System.out.println("Second largest=" + sc);
    }
}