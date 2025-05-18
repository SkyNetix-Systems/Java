/*
    Title: Swap value of two variables
    >> Write down a program that will swap value of two variable
    ## Test ##
    input: n1 = 2, n2 = 3  output: n1 = 3, n2 = 2
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
        // using temporary variable
        /*
        int tmp = n1;
        n1 = n2;
        n2 = tmp;
        System.out.println("n1=" + n1 + " n2=" + n2);
         */
//        n1 = n1 + n2;
//        n2 = n1 - n2;
//        n1 = n1 - n2;
        n1 = n1 * n2;
        n2 = n1 / n2;
        n1 = n1 / n2;
        System.out.println("n1=" + n1 + " n2=" + n2);
    }
}
