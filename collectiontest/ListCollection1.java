package com.pearl.training.collectiontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCollection1 {
    public static void main(String[] args) {
        List<String> numbers=new ArrayList<>();
        numbers.add("2");
        numbers.add("3");
        numbers.add("5");
        numbers.add("5");
        numbers.add("7");
        numbers.add("21");
        numbers.add("25");
        numbers.add("1");
        System.out.println("numbers: "+numbers);
        numbers.set(1,"89");
        numbers.remove(6);
        System.out.println("numbers Updated: "+numbers);
        for(String  nums:numbers){
            System.out.println(nums);
        }
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);
        List<String> startsWith1=numbers.stream().filter(f->f.startsWith("1")).toList();
        System.out.println("Starts with 1:"+startsWith1);
        System.out.println("Size:"+numbers.size());
        System.out.println("contains 1:"+numbers.contains("1"));
        System.out.println("isempty? 1:"+numbers.isEmpty());
    }
}
