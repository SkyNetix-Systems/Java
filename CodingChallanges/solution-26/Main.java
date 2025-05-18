/*
    Title: Checking a string is a palindrome or not
    >> Write down a program that will check given string is a palindrome or not
    ## Test ##
    input: hello output: false
    input: awa   output: true
*/

package com.techbarik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Enter a string:");
        str = scanner.nextLine();
        System.out.println(is_palindrome(str));
    }
    public static boolean is_palindrome(String str) {
        String st = "";
        int len = str.length();
        for(int i=len; i>=1; i--) {
            st = st + str.substring(i-1, i);
        }
        // hello  => 5
        // "hello".substring(4, 5) => "" + "o"  => "o"
        // "hello".substring(3, 4) => "l" + "o" => "lo"
        if(str.compareTo(st) == 0) {
            return true;
        } else {
            return false;
        }
    }
}