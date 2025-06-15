package com.pearl.training.collectiontest;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByLengthAndSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Chanelle", "Amy", "Bob","Matt", "Elizabeth");

		Map<Integer, List<String>> grouped = names.stream()
		    .collect(Collectors.groupingBy(String::length));

		System.out.println(grouped);
		
		List<String> namesForSorting = Arrays.asList("Zara", "Alice", "Bob");
		System.out.println("After sorting===>");
		List<String> sorted = namesForSorting.stream()
		    .sorted()
		    .collect(Collectors.toList());
		List<Integer> numberSorting=Arrays.asList(433,64,2,1,456,86,2,3,7,8,64,23,57,3323);
		List<Integer> sortedNums=numberSorting.stream().sorted().toList();
		System.out.println(sorted); // [Alice, Bob, Zara]
		System.out.println(sortedNums);
		List<Integer> evens = sortedNums.stream()
				.filter(n -> n % 2 == 0)
				.toList();
		System.out.println(evens);
		Set<Integer> set = new HashSet<>(evens);
		System.out.println(set.stream().sorted().toList());
	}

}
