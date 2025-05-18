/*
    Title: Sort values of three variables in ASC order
    >> Write down a program that will takes three number as input and
    >> will sort them in ASC order
    ## Test ##
    input: n1=5 n2=8 n3=3 output: n1=3 n2=5 n3=8
    input: n1=5 n2=2 n3=9 output: n1=2 n2=5 n3=9
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
        int min = n1<n2&&n1<n3 ? n1 : n2<n1&&n2<n3 ? n2 : n3;
        int max = n1>n2&&n1>n3 ? n1 : n2>n1&&n2>n3 ? n2 : n3;
        int sc = n1>n2&&n1>n3 ? n2>n3?n2:n3 : n2>n1&&n2>n3 ? n1>n3?n1: n3 : n1>n2?n1:n2;
        n1 = min;
        n2 = sc;
        n3 = max;
        System.out.println("n1=" + n1 + " n2=" + n2 + " n3=" + n3);
    }
}