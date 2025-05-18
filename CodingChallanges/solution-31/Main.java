/*
    Title: Decimal to Hexadecimal
    >> Write down a program that will take a number as input and will print equivalent hexadecimal
    ## Test ##
    input: 80 output: 50
    input: 50 output: 32
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dec_num;
        System.out.println("Enter a decimal num:");
        dec_num = scanner.nextInt();
        int remainder, hex_num = 0, i=0;
        while(dec_num != 0) {
            remainder = dec_num % 16;
            hex_num = (int) (hex_num + remainder * Math.pow(10, i));
            i++;
            dec_num = dec_num / 16;
        }
        System.out.println("Hex:" + hex_num);
    }
}