/*
    Title: Reverse a string
    >> Write down a program that will reverse a string
    ## Test ##
    input: hello   output: olleh
    input: string   output: gnirts
    input: reverse  output: esrever
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Enter a string:");
        str = scanner.nextLine();
        System.out.println(reverse_string(str));
    }
    public static String reverse_string(String str) {
        String st = "";
        int len = str.length();
        for(int i=len; i>=1; i--) {
            st = st + str.substring(i-1, i);
        }
        // hello => 5
        // "hello".substring(4, 5) => "o" + "" => "o"
        // "hello".substring(3, 4) => "o" + "l" => "ol"
        return st;
    }
}
