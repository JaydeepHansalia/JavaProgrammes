package Programmes;

import java.util.Arrays;
import java.util.Iterator;

public class FindNumberOfWords {

    public static void main(String[] args){
        String input="Jaydeep Hansalia Jaydeep Patel";
        int count=0;
        String[] words= input.split(" ");

        for(String word: words){
            count++;
        }
        System.out.println(count);
    }
}
