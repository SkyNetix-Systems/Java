/*
    Title: Hexadecimal to decimal
    >> Write down a program that will take a hexadecimal number as input and will print equivalent decimal number
    ## Test ##
    input: 375  output: 885
    input: 16   output: 22
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hex_num;
        System.out.println("Enter a hex number:");
        hex_num = scanner.nextInt();
        int remainder, dec_num = 0, i=0;
        while(hex_num != 0) {
            remainder = hex_num % 10;
            dec_num = (int) (dec_num + remainder * Math.pow(16, i));
            hex_num = hex_num / 10;
            i++;
        }
        System.out.println("Dec:" + dec_num);
    }
}