package Programmes;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateWords {

    public static void main(String[] args){
        String line = "Jaydeep Hansalia Jaydeep Hansalia";
        String[] words = line.split(" ");
        int count=0;
        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i< words.length; i++){
            if(!list.contains(words[i])) {
                list.add(words[i]);
                count++;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        System.out.println(words[i]+   count);
                    }
                }
            }
            count=0;
        }
    }
}
