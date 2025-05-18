package com.skynetix;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String str = "a,b$c";
        List<Character> result = new ArrayList<>();

        char[] ch = str.toCharArray();
        int right = str.length() -1;
        int left = 0;
        while(left < right){
            if(!Character.isLetter(ch[left])){
                left++;
            } else if (!Character.isLetter(ch[right])){
                right--;
            } else{
               char temp = ch[left];
               ch[left] = ch[right];
               ch[right] = temp;
               left++;
               right--;
            }
        }

        System.out.println(ch);
    }
}