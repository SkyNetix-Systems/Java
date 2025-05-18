/*
    Title: Decimal to Octal
    >> Write down a program that will take a number as input and will print equivalent octal
    ## Test ##
    input: 175 output: 257
    input: 50 output: 62
 */

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dec_num;
        System.out.println("Enter a decimal num:");
        dec_num = scanner.nextInt();
        int remainder, oct_num = 0, i=0;
        while(dec_num != 0) {
            remainder = dec_num % 8;
            oct_num = (int) (oct_num + remainder * Math.pow(10, i));
            dec_num = dec_num / 8;
            i++;
        }
        System.out.println("Oct:" + oct_num);
    }
}