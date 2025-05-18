/*
    Title: Leap Year
    >> Write down a program that will take a year as input and will check the given
    >> year is a leap year or not
    ## Test ##
    input: 2020  output: true
    input: 2021  output: false
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year:");
        year = scanner.nextInt();
        if(year%400==0) {
            System.out.println(true);
        } else if(year%100==0) {
            System.out.println(false);
        } else if(year%4==0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}