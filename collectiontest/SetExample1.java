package com.pearl.training.collectiontest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {
    public static void main(String[] args) {
//        Set<Integer> ids=new TreeSet<>();
        Set<Integer> ids=new TreeSet<>();
        ids.add(2);
        ids.add(3);
        ids.add(2);
        ids.add(1);
        ids.add(7);
        ids.add(5);
        System.out.println("Sorted Numbers"+ids);
    }
}
