/*
    Title: Fizzbuzz
    >> Write down a program that will take an integer as input and will print 1 to n
    >> but for multiples of three print 'fizz' instead of the number and for multiples
    >> of five print 'buzz'. Also for numbers which are multiples of both three and five print 'fizzbuzz'
    ## Test ##
    input: 5  output: 1 2 "fizz" 4 "buzz"
    input: 15 output: 1 2 "fizz" 4 "buzz" "fizz" 7 8 "fizz" "buzz" 11 "fizz" 13 14 "fizzbuzz"
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter an integer:");
        n = scanner.nextInt();
        for(int i=1; i<=n; i++) {
            if(i%3==0 && i%5==0) {
                System.out.println("fizzbuzz");
            } else if(i%3==0) {
                System.out.println("fizz");
            } else if(i%5==0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}