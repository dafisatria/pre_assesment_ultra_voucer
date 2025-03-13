package com.enigmacamp;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        String[] words = {"cook", "save", "taste", "aves", "vase", "state", "map"};
        List<List<String>> list = new ArrayList<>();//penampung
        List<String> temp = new ArrayList<>();
        List<String> temp1 = new ArrayList<>();
        List<String> temp2 = new ArrayList<>();
        List<String> temp3 = new ArrayList<>();
        for (String word : words) {//ulang tiap kata dalam array
            char[] wordCharArray = word.toCharArray();//pecah tiap kata menjadi tiap huruf dalam char
            if(word.contains("c")&&word.contains("o")&&word.contains("k")){
                temp.add(word);
            } else if(word.contains("s")&&word.contains("a")&&word.contains("v")&&word.contains("e")){
                temp1.add(word);
            } else if(word.contains("s")&&word.contains("t")&&word.contains("a")&&word.contains("e")){
                temp2.add(word);
            } else if(word.contains("m")&&word.contains("a")&&word.contains("p")){
                temp3.add(word);
            }
        }
        list.add(temp);
        list.add(temp1);
        list.add(temp2);
        list.add(temp3);
        System.out.println(list);
    }
}
