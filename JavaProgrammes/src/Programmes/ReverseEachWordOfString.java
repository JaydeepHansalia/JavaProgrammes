package Programmes;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;

public class ReverseEachWordOfString {

    public static void main(String[] args){
        String input = "Software Automation Testing";
        String[] words = input.split(" ");

        for(String eachWord: words){
            for(int i=eachWord.length()-1; i>=0; i--){
               char reverseWord = eachWord.charAt(i);
                System.out.print(reverseWord);
            }
            System.out.print(" ");
        }
    }
}
