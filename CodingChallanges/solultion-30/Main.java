/*
    Title: Octal to decimal
    >> Write down a program that will take a octal number as input and will print equivalent decimal number
    ## Test ##
    input: 50  output: 40
    input: 130 output: 88
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oct_num;
        System.out.println("Enter a ocatal num:");
        oct_num = scanner.nextInt();
        int remainder, dec_num = 0, i=0;
        while(oct_num != 0) {
            remainder = oct_num % 10;
            dec_num = (int) (dec_num + remainder * Math.pow(8, i));
            i++;
            oct_num = oct_num / 10;
        }
        System.out.println("Dec:" + dec_num);
    }
}