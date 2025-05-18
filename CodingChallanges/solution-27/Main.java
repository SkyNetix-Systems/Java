/*
    Title: Binary to decimal
    >> Write down a program that will take a binary number as input and will print equivalent decimal number
    ## Test ##
    input: 111  output: 7
    input: 1001 output: 9
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bin_num;
        System.out.println("Enter a binary num:");
        bin_num = scanner.nextInt();
        int remainder, dec_num = 0, i=0;
        while(bin_num != 0) {
            remainder = bin_num % 10;
            dec_num = (int) (dec_num + remainder * Math.pow(2, i));
            i++;
            bin_num = bin_num / 10;
        }
        System.out.println("Dec:" + dec_num);
    }
}